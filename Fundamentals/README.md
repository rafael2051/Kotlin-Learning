## KOTLIN FUNDAMENTALS

This folder contains the fundamentals of Kotlin that i learned through the [Kotlin Tour](https://kotlinlang.org/docs/kotlin-tour-welcome.html) and [Learn Kotling by Example](https://play.kotlinlang.org/byExample/overview) sections in https://kotlinlang.org. I've created my own examples based on the content that i mentioned.<br>
If you want, you can learn through my examples, following the next sequence of topics.

### TOPICS
- Variables
    - Basic Variables
    - Function Types
    - Vararg
- Control FLow
    - When
    - Ranges
    - Equality
    - Exceptions
- Functions
    - Basic Functions
    - Infix Functions
    - Operator Functions
    - High Order Functions
    - Lamba Expressions
    - Scope Functions
- Classes
    - Simple Classes
    - Data Classes
    - Generic Classes
    - Enum Classes
- Collections
    - Lists
    - Sets
    - Maps
- Inheritance
    - Examples
    - Polygons

### INSTALLING THE COMPILER
You can run the codes in Intellij or in [kotlinlang playground](https://play.kotlinlang.org/?_gl=1*16mbesh*_ga*MjAyNDA1MjI3MS4xNzA0NzM1MDU1*_ga_9J976DJZ68*MTcwNDg0Mzk2NS4xMS4xLjE3MDQ4NDU3NTkuMS4wLjA.&_ga=2.178452327.2117909367.1704735056-2024052271.1704735055#eyJ2ZXJzaW9uIjoiMS45LjIxIiwicGxhdGZvcm0iOiJqYXZhIiwiYXJncyI6IiIsIm5vbmVNYXJrZXJzIjp0cnVlLCJ0aGVtZSI6ImlkZWEiLCJjb2RlIjoiZnVuIG1haW4oKSB7XG4gICAgdmFsIGtvdGxpbiA9IFwi8J+ZglwiXG4gICAgcHJpbnRsbihrb3RsaW4pXG59In0=), the easiest way. Or, you can install the compiler in your computer and compile with the terminal. I hardly recommend you to do that, for education purposes. If you are using any Linux distribution based system, open a terminal and follow the next steps to install SDK:

    curl -s "https://get.sdkman.io" | bash
This will get a bash script from the server and redirect the output to bash using pipe. Basically, you are running a bash script that installs sdk. <br>
After concluded, run the following command:

    source "$HOME/.sdkman/bin/sdkman-init.sh"
Then, copy and paste this line to confirm that SDK installation was succesful:

    sdk version
If you see something like this, everything went well.

    SDKMAN!
    script: 5.18.2
    native: 0.4.6
SDK is a SDK manager that allows you to download different versions of SDK and switch between then. You can also install Kotlin compiler with it, so now just run the next command:

    sdk install kotlin

### COMPILE
With kotlinc installed, just change your current directory to some of the folders that has the source code, such as variables, and compile one of the files running this command:

    kotlinc <filename>.kt -include-runtime -d <target>.jar
Override filename by the source file you want to compile, and target for the name you want to give to the executable.

### EXECUTE

After have compiled any source file, simply run:

    java -jar <target>.jar