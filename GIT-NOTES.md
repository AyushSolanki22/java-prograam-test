
# Git & GitHub Guide

## 🧠 Introduction
- **Git**: A version control system to manage code history.
- **GitHub**: A website to host, manage, and collaborate on Git repositories.
- **Repository**: A project folder that tracks code and changes.
- **README.md**: Optional file that explains the project (you're reading it now!).

---

## 🔧 Setup & Installation

### 1. Install Git
Use [Git official website](https://git-scm.com/) to install Git.

To confirm installation:
```bash
git --version
```

### 2. Configure Git
Set your identity:
```bash
git config --global user.name "Your Name"
git config --global user.email "your@example.com"
git config --list    # to view all configs
```

> Use Terminal, Git Bash (Windows), or the built-in terminal in VS Code.

---

## 📁 Git Basics

### 3. Basic Terminal Commands
```bash
git clone <repo-link>       # Clone an existing repo
git status                  # See current repo state
pwd/cd                      # Show current directory
cd <folder>                 # Change directory
mkdir <folder>              # Make new folder
rmdir                       # Remove Folder
ls or ls -a  / dir          # List files
cat/type                    # Shows file content
q                           # Quit help/output
clear/cs                    # Clear screen
```

---

## 🔁 Git Workflow

### 4. Git Lifecycle
1. **Untracked** →
2. **Staged** (git add) →
3. **Committed** (git commit) →
4. **Pushed** (git push)

```bash
git add <file>      # Stage file
git add .           # Stage all files
git commit -m "message"
git push origin main

--> git diff            # make reviewable,readable note of all changes.

--> git fetch --all     # get all changes in remote directories to local directories.
```

---

## 🚀 Starting a Project (without clone)
```bash
git init                                # Initialize git in a folder
git remote add origin <repo-link>       # Link with GitHub repo
git remote -v                           # Verify remote URL
git branch                              # Check current branch
git branch -M main                      # Rename branch to main
git push -u origin main                 # Push first time
```

---

## 🌿 Branching

```bash
git checkout <branch>       # Switch branch
git checkout -b <new>       # Create and switch to new branch
git branch -d <branch>      # Delete branch
```

---

## 🔀 Merging & Pull Requests

```bash
git diff <branch>           # Compare changes
git merge <branch>          # Merge a branch
git pull origin main        # Pull remote changes
```

- **Pull Request (PR)**: Collaborators propose changes to the main codebase via GitHub.
- PRs are often reviewed by team leads or seniors.

---

## ⚠️ Merge Conflicts
Handled in a code editor like VS Code. Resolve manually, save, commit again.

---

## 🧼 Undoing Changes

- **Unstage a file**:
```bash
git reset <file>
```

- **Undo last commit**:
```bash
git reset HEAD~1
```

- **Reset to a specific commit**:
```bash
git reset <commit-hash>         # Soft reset
git reset --hard <commit-hash>  # Hard reset
```

---

## 🍴 Forking
A **fork** is a personal copy of someone else’s repository. It helps contribute without affecting the original repo.

---

🧠 **Tip**: Always commit with meaningful messages!
