# LeetCode Solutions

My LeetCode problem-solving progress, automatically synced to this repository using [LeetSync](https://github.com/LeetSync/LeetSync), a Chrome extension that pushes accepted submissions straight from LeetCode to GitHub.

## About

This repo is **not** hand-maintained — solutions land here automatically whenever I solve a problem on LeetCode and LeetSync pushes it via the GitHub API. Credit for the sync tooling goes to the [LeetSync](https://github.com/LeetSync/LeetSync) project; this repository just holds the output.

## How it works

1. Solve a problem on [LeetCode](https://leetcode.com).
2. Submit an accepted solution.
3. The LeetSync extension detects the accepted submission and creates/updates a file here via the GitHub API.

## Structure

Each solved problem gets its own folder, generally organized as:

```
problem-name/
├── solution.<ext>   # the accepted solution
└── README.md        # problem notes / description (if generated)
```

## Setup (for reference)

If you want to replicate this on your own repo:

1. Install the [LeetSync Chrome extension](https://chromewebstore.google.com/detail/leetsync-leetcode-to-gith/ppkbejeolfcbaomanmbpjdbkfcjfhjnd).
2. Authorize it with GitHub and select a destination repository.
3. Log in to LeetCode (if not already).
4. Solve and submit — accepted solutions sync automatically.

## Disclaimer

This repository is generated content from solving LeetCode problems for personal practice. Solutions are my own work; the sync mechanism (LeetSync) is a third-party tool, not something I authored.
