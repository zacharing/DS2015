#include<stdio.h>
#include<stdlib.h>

int main(int argc, char *argv[]){
    char *names[] ={ "Thad", "Daniel", "Bruce","Zach","Ben","Jace","Carl","Declan","Collin","Ryan","Jared","Ashelee"};
    printf("Today's call sequence is as follows: \n");
    srand(time(NULL));
    char tmp=0;
    int i =0;
    for(i =0;i<15;i++){
        printf(" %s \n",names[rand()%12]);
        scanf("%c",&tmp);   
    }
}
