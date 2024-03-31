terraform {
  required_version = "1.7.5"
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "5.41.0"
    }
  }
}

resource "aws_ecr_repository" "greeting_ecr_repository" {
  name = "greeting"
}

resource "aws_ecs_cluster" "greeting_ecs_cluster" {
  name = "greeting_ecs_cluster"
}

resource "aws_ecs_task_definition" "DanielGreetingTaskDefinition" {
  family = "DanielGreetingTaskDefinition"
  container_definitions = jsonencode([
    {
      name = "greeting_container"
      image = "813165177829.dkr.ecr.us-east-1.amazonaws.com/greeting:latest"
      cpu = 512
      memory = 1024
      memoryReservation = 1024
      portMappings = [
        {
          name = "greeting_container-8080-tcp"
          containerPort = 8080
          hostPort = 8080
          protocol = "tcp"
          appProtocol = "http"
        }
      ]
      essential = true
      environment = []
      environmentFiles = []
      mountPoints = []
      volumesFrom = []
      ulimits = []
      systemControls = []
    }
  ])
  task_role_arn = "arn:aws:iam::813165177829:role/ecsTaskExecutionRole"
  execution_role_arn = "arn:aws:iam::813165177829:role/ecsTaskExecutionRole"
  network_mode = "awsvpc"
  requires_compatibilities = [
    "FARGATE"
  ]
  cpu = "512"
  memory = "1024"
  runtime_platform {
    cpu_architecture = "X86_64"
    operating_system_family = "LINUX"
  }
}