Trying to run coroutines in kotlinjs

Build output:

```
> Task :kotlinNodeJsSetup SKIPPED
> Task :kotlinNpmResolve

> Task :compileKotlinJs FAILED
e: /home/user/no-kotlinx/src/main/kotlin/test.kt: (1, 8): Unresolved reference: kotlinx
e: /home/user/no-kotlinx/src/main/kotlin/test.kt: (4, 5): Unresolved reference: GlobalScope
e: /home/user/no-kotlinx/src/main/kotlin/test.kt: (5, 9): Unresolved reference: delay
e: /home/user/no-kotlinx/src/main/kotlin/test.kt: (9, 5): Unresolved reference: Thread

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':compileKotlinJs'.
> Compilation error. See log for more details

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 3s
2 actionable tasks: 2 executed

```
