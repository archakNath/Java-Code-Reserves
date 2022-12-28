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
### [binary-pattern](https://github.com/archakNath/Java-Code-Reserves/blob/main/pattern/src/binary-pattern.java)
```
1 
0 1 
1 0 1
0 1 0 1 
1 0 1 0 1
```
```
for(int i = 1; i <= n; i++){
  for(int j = i; j >= 1; j--){
    System.out.print(j%2+" ");
  }
  System.out.println();
}
```
### [rift-number-pattern](https://github.com/archakNath/Java-Code-Reserves/blob/main/pattern/src/rift-number-pattern.java)
```
1                 1
1 2             2 1
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1
```
```
for(int i = 1; i <= n; i++){
  for(int j = 1; j <= i; j++){
    System.out.print(j+" ");
  }
  
  for(int k = 10; k >= 2*i+1;k--){
      System.out.print("  ");
  }
  
  for(int s = i; s >= 1; s--){
      System.out.print(s+" ");
  }
  System.out.println("");
}
```
### [counter-number-pattern](https://github.com/archakNath/Java-Code-Reserves/blob/main/pattern/src/counter-number-pattern.java)
```
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
```
```
int count = 1; 
for(int i = 1; i <= n; i++){
    for(int j = 1; j <= i; j++){
        System.out.print(count+" ");
        count++;
    }
    System.out.println();
}
```
### [inverted-alphabet-pattern](https://github.com/archakNath/Java-Code-Reserves/blob/main/pattern/src/inverted-alphabet-pattern.java)
```
ABCDE
ABCD
ABC
AB
A
```
```
for(int i = 64+n; i >= 65; i--){
  for(int j = 65; j <= i; j++){
      System.out.print((char)j);
  }
  System.out.println();
}
```
### [alphabet-pattern1](https://github.com/archakNath/Java-Code-Reserves/blob/main/pattern/src/alphabet-pattern1.java)
```
A
BB
CCC
DDDD
EEEEE
```
```
for(int i = 65; i <= 65+n-1; i++){
  for(int j = 65; j <= i; j++){
      System.out.print((char)i);
  }
  System.out.println();
}
```
### [alphabet-pyramid](https://github.com/archakNath/Java-Code-Reserves/blob/main/pattern/src/alphabet-pyramid.java)
```
   A
  ABA
 ABCBA
ABCDCBA
```
```
for(int i = 65; i <= 65+n-1; i++){
  for(int j = n-i+64; j >= 1; j--){
      System.out.print(" ");
  }
  
  for(int j = 65; j <= i; j++){
      System.out.print((char)j);
  }
  
  for(int j = i-1; j >= 65; j--){
      System.out.print((char)j);
  }
  System.out.println();
}
```
### [alphabet-pattern2](https://github.com/archakNath/Java-Code-Reserves/blob/main/pattern/src/alphabet-pattern2.java)
```
E
E D
E D C
E D C B
E D C B A
```
```
for(int i = 64+n; i >= 65; i--){
  for(int j = 64+n; j >= i; j--){
      System.out.print((char)j+" ");
  }
  System.out.println();
}
```
### [complex-star-pattern](https://github.com/archakNath/Java-Code-Reserves/blob/main/pattern/src/complex-star-pattern.java)
```
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
```
```
for(int i = n; i >= 1; i--){
  for(int j = 1; j <= i; j++){
      System.out.print("*");
  }
  
  for(int j = 1; j <= n-i; j++){
      System.out.print("  ");
  }
  
  for(int j = 1; j <= i; j++){
      System.out.print("*");
  }
  System.out.println();
}
        
for(int i = 1; i <= n; i++){
  for(int j = 1; j <= i; j++){
      System.out.print("*");
  }
  
  for(int j = 1; j <= n-i; j++){
      System.out.print("  ");
  }
  
  for(int j = 1; j <= i; j++){
      System.out.print("*");
  }
  System.out.println();
}
```
### [complex-star-pattern1](https://github.com/archakNath/Java-Code-Reserves/blob/main/pattern/src/complex-star-pattern1.java)
```
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
```
```
for(int i = 1; i <= n; i++){
    for(int j = 1; j <= i; j++){
      System.out.print("*");
    }
    
    for(int j = n-i; j >= 1; j--){
      System.out.print("  ");
    }
    
    for(int j = 1; j <= i; j++){
      System.out.print("*");
    }
    System.out.println();
  }
        
  for(int i = n-1; i >= 1; i--){
    for(int j = 1; j <= i; j++){
      System.out.print("*");
    }
    
    for(int j = n-i; j >= 1; j--){
      System.out.print("  ");
    }
    
    for(int j = 1; j <= i; j++){
      System.out.print("*");
    }
    System.out.println();
  }
}
```
### [border-star-pattern](https://github.com/archakNath/Java-Code-Reserves/blob/main/pattern/src/border-star-pattern.java)
```
****
*  *
*  *
****
```
```
for(int i = 0; i < n; i++){
  for(int j = 0; j < n; j++){
      if(i==0 || j==n-1 || i==n-1 || j==0)
      System.out.print("*");
      else
      System.out.print(" ");
  }
  System.out.println();
}
```
### [border-number-pattern](https://github.com/archakNath/Java-Code-Reserves/blob/main/pattern/src/border-number-pattern.java)
```
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
```
```
for(int i = n; i >= 1; i--){
  for(int j = n; j >= i; j--){
    System.out.print(j+" ");
  }
  
  for(int j = ((i-1)*2)-1; j >= 1; j--){
    System.out.print(i+" ");
  }
  
  for(int j = i; j <= n; j++){
    if(j==1)
    continue;
    System.out.print(j+" ");
  }
  System.out.println();
}
        
for(int i = 2; i <= n; i++){
  for(int j = n; j >= i; j--){
    System.out.print(j+" ");
  }
  
  for(int j = ((i-1)*2)-1; j >= 1; j--){
    System.out.print(i+" ");
  }
  
  for(int j = i; j <= n; j++){
    if(j==1)
    continue;
    System.out.print(j+" ");
  }
  System.out.println();
}
```