package main

import "fmt"

func main() {
    var(
        n int
        temp int
        sum=1 
        a=1 
    )
    fmt.Println("Enter a number : ")
    fmt.Scan(&n)
    n=n-1
    fmt.Println(a)
    for i:=0;i<n;i++ {
        temp = sum
        sum = sum+a
        a=temp
        for k:=0;k<sum;k++ {
            fmt.Print(sum)
        }
        fmt.Println()
    }
}
