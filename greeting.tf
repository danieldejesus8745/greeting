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
  name = "greeting_ecr_repository"
}

resource "aws_ecs_cluster" "greeting_ecs_cluster" {
  name = "greeting_ecs_cluster"
}