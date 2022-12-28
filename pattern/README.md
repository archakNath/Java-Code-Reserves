# Pattern Programs
In this repository, I have compiled all the information required for making of various pattern program and explained their logic as well.

## Prerequisites
- Understanding of basic java syntax
- Knowledge of loops
- Logical thinking
## Introduction
Patterns mainly follow the basic structure of two loops, one outer and second inner loop. Sometimes another inner loop is added inside the outer loop to add empty spaces. The basic structure is as follows:


```
for(int i = <>; i <= <>; i++){
  for(int k = <>; k <= <>; k++){
    //for loop for printing spaces(optional)
    System.out.print(" ");
  }
  for(int j = <>; j <= <>; j++){
    //Print statement
    System.out.print(<>);
  }
  System.out.println();
}
```

### [n*n star pattern](https://github.com/archakNath/Java-Code-Reserves/blob/main/pattern/src/NxNStarPattern.java)
```
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```


```
for(int i = 0; i < n; i++){
  for(int j = 0; j < n; j++){
    System.out.print("* ");
  }
  System.out.println();
}
```

### [left aligned star pattern](https://github.com/archakNath/Java-Code-Reserves/blob/main/pattern/src/left-align-triangle.java)
```
* 
* * 
* * * 
* * * * 
* * * * *
```


```
for(int i = 1; i <= n; i++){
  for(int j = 1; j <= i; j++){
    System.out.print("* ");
  }
  System.out.println();
}
```

### [triangle-number-pattern1](https://github.com/archakNath/Java-Code-Reserves/blob/main/pattern/src/triangle-number-pattern1.java)
```
1
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
```
```
for(int i = 1; i <= n; i++){
  for(int j = 1; j <= i; j++){
    System.out.print(j+" ");
  }
  System.out.println();
}
```