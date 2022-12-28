/*
 * This project is licensed under the MIT license. Module model-view-viewmodel is using ZK framework licensed under LGPL (see lgpl-3.0.txt).
 *
 * The MIT License
 * Copyright © 2014-2022 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */


// Input--4

//Output--
// 4 4 4 4 4 4 4
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4


class Solution {

    void printTriangle(int n) {
        //code here
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
    }
}