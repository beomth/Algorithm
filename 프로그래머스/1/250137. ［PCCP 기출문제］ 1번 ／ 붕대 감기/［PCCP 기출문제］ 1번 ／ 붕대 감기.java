class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int time = -1;
        int curHealth = health;
        int success = 0;
        
        int last_time = attacks[attacks.length-1][0];
        int idx = 0;    // attacks index
        
        while(time  <= last_time) {
            time++;
            
            // 초기조건
            if(time == 0)   continue;
            
            // 종료조건
            if(time > last_time || curHealth <= 0)  break;
            
            // 공격
            if(time == attacks[idx][0]) {
                curHealth -= attacks[idx][1];
                success = 0;
                if(curHealth <= 0)  return -1;
                idx++;
            }
            else {  // 공격이 아님
                curHealth += bandage[1];
                success += 1;
                if(success == bandage[0]) {     // 추가체력 회복
                    curHealth += bandage[2];
                    success = 0;    // 연속성공 초기화
                }
                curHealth = Math.min(curHealth, health);
                
            }
            
        }
        
        if(curHealth <= 0)  return -1;
        else    return curHealth;
    }
}