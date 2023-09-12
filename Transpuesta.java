public class Transpuesta {
    public static void main(String[] args) {
        //MATRIZ A
        int matriz1[][]={{1,4,6},{3,-2,5}};  
        int transpuesta1[][]=new int [matriz1[0].length][matriz1.length]; 
        System.out.println("Matriz original A: ");
        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1.length;j++){
                transpuesta1[i][j]=matriz1[j][i];
                System.out.print(matriz1[j][i]+"  "); 
            }
            System.out.println();
        }
        System.out.println("Matriz transpuesta A: ");
        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1.length;j++){
                System.out.print(transpuesta1[j][i]+"  "); 
            }
            System.out.println();
        }
        //MATRIZ B
        int matriz2[][]={{-2,1,0},{5,-2,2}};  
        int transpuesta2[][]=new int [matriz2[0].length][matriz2.length]; 
        System.out.println("Matriz original B: ");
        for(int i=0;i<matriz2.length;i++){
            for(int j=0;j<matriz2[0].length;j++){
                transpuesta2[j][i]=matriz2[i][j];
                System.out.print(matriz2[i][j]+"  "); 
            }
            System.out.println();
        }
        System.out.println("Matriz transpuesta B: ");
        for(int i=0;i<matriz2[0].length;i++){
            for(int j=0;j<matriz2.length;j++){
                System.out.print(transpuesta2[i][j]+"  "); 
            }
            System.out.println();
        }
        //MATRIZ C
        int matriz3[][]={{3,-2},{0,1}};  
        int transpuesta3[][]=new int [matriz3[0].length][matriz3.length]; 
        System.out.println("Matriz original C: ");
        for(int i=0;i<matriz3.length;i++){
            for(int j=0;j<matriz3.length;j++){
                transpuesta3[j][i]=matriz3[i][j];
                System.out.print(matriz3[i][j]+"  "); 
            }
            System.out.println();
        }
        System.out.println("Matriz transpuesta C: ");
        for(int i=0;i<matriz3.length;i++){
            for(int j=0;j<matriz3.length;j++){
                System.out.print(transpuesta3[i][j]+"  "); 
            }
            System.out.println();
        }
    }
}