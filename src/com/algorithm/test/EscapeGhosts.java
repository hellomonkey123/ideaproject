package com.algorithm.test;

import org.junit.Test;

public class EscapeGhosts {

    public boolean escapeGhosts(int[][] ghosts, int[] target) {

        int run_step = Math.abs(target[0]) + Math.abs(target[1]);
        for(int i = 0; i < ghosts.length; i++){
            if(Math.abs(ghosts[i][0] - target[0]) + Math.abs(ghosts[i][1] - target[1]) <= run_step) return false;
        }
        return true;
    }

    @Test
    public void test(){
        int[][] a = {{1,8},{-9,0},{-7,-6},{4,3}};
        int[] target = {6,-9};

        System.out.println(escapeGhosts(a, target));
    }
}
