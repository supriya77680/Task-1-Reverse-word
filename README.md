# Reverse Input File Project

This project reads data from `input.txt`, processes it to reverse the words while maintaining the order of punctuation marks (. , !), and writes the result to `output.txt`.

## Table of Contents
- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Setup Instructions](#setup-instructions)
  - [Clone the Repository](#clone-the-repository)
  - [Build the Project](#build-the-project)
- [Input and Output](#input-and-output)
- [Example](#example)
- [License](#license)

## Introduction
The purpose of this project is to demonstrate file handling and string manipulation in Java. Specifically, it reads data from `input.txt`, reverses the order of words in each line, and writes the processed data to `output.txt`. The reversal does not affect the order of punctuation marks (. , !) in the text.

## Prerequisites
- Java Development Kit (JDK) 8 or higher
- Gradle (or your preferred build tool)

## Setup Instructions
### Clone the Repository
Clone the Reverse Input File repository from GitHub:
```bash
git clone <repository_url>
```

## Build the Project
```bash
graddle build
```

## Input and Output
- input.txt: This file contains the text data that needs to be processed.
- output.txt: After processing, this file will contain the processed text with reversed words (excluding punctuation marks).

## Example
- Suppose input file contains
```bash
My name is Supriya!
I am Java Developer.
```
- After running the application, output.txt will contain:
```bash
yM eman si ayirpuS!
I ma avaJ repoleveD.
```




