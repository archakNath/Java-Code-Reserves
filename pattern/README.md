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
### [triangle-number-pattern2](https://github.com/archakNath/Java-Code-Reserves/blob/main/pattern/src/triangle-number-pattern2.java)
```
1
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5
```
```
for(int i = 1; i <= n; i++){
  for(int j = 1; j <= i; j++){
    System.out.print(i+" ");
  }
  System.out.println();
}
```
### [inverted-star-triangle](https://github.com/archakNath/Java-Code-Reserves/blob/main/pattern/src/inverted-star-triangle.java)
```
* * * * *
* * * * 
* * * 
* *  
* 
```
```
for(int i = n; i >= 1; i--){
  for(int j = 1; j <= i; j++){
    System.out.print("* ");
  }
  System.out.println();
}
```
### [inverted-number-triangle](https://github.com/archakNath/Java-Code-Reserves/blob/main/pattern/src/inverted-number-triangle.java)
```
1 2 3 4 5
1 2 3 4
1 2 3 
1 2  
1 
```
```
for(int i = n; i >= 1; i--){
  for(int j = 1; j <= i; j++){
    System.out.print(j+" ");
  }
  System.out.println();
}
```
### [star-pyramid](https://github.com/archakNath/Java-Code-Reserves/blob/main/pattern/src/star-pyramid.java)
```
    *
   ***  
  *****
 *******
*********
```
```
for(int i = 1; i <= n; i++){
  for(int k = n-i; k >= 1; k--){
    System.out.print(" ");
  }
  for(int j = 1; j <= ((i-1)*2)+1; j++){
    System.out.print("*");
  }
  System.out.println();
}
```
### [inverted-star-pyramid](https://github.com/archakNath/Java-Code-Reserves/blob/main/pattern/src/inverted-star-pyramid.java)
```
*********
 *******
  *****
   ***
    *
```
```
for(int i = n; i >= 1; i--){
  for(int k = n-i; k >= 1; k--){
    System.out.print(" ");
  }
  for(int j = i*2-1; j >= 1; j--){
    System.out.print("*");
  }
  System.out.println();
}
```
### [connected-star-pyramid](https://github.com/archakNath/Java-Code-Reserves/blob/main/pattern/src/connected-star-pyramid.java)
```
    *
   * *
  * * *
 * * * *
* * * * *
* * * * *
 * * * *
  * * *
   * *
    *
```
```
for(int i = 1; i <= n; i++){
  for(int k = n-i; k >= 1; k--){
    System.out.print(" ");
  }
  for(int j = 1; j <= i; j++){
    System.out.print("* ");
  }
  System.out.println();
}
        
        
for(int i = n; i >= 1; i--){
  for(int k = n-i; k >= 1; k--){
    System.out.print(" ");
  }
  for(int j = i; j >= 1; j--){
    System.out.print("* ");
  }
  System.out.println();
}
```
### [vertical-star-pyramid](https://github.com/archakNath/Java-Code-Reserves/blob/main/pattern/src/vertical-star-pyramid.java)
```
* 
* * 
* * * 
* * * * 
* * * * *
* * * *
* * *
* *
*
```
```
for(int i = 1; i <= n; i++){
  for(int j = 1; j <= i; j++){
    System.out.print("* ");
  }
  System.out.println();
}

for(int i = n-1; i >= 1; i--){
  for(int j = 1; j <= i; j++){
    System.out.print("* ");
  }
  System.out.println();
}
```