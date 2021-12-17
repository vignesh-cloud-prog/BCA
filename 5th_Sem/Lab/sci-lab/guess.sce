function play_game()
number = grand(1,1,"uin",0,10)
disp(number)
for n=1:3
    x = input("Guess a number between 0 to 10 [chance "+string(n)+" of 3]: ")
   
    if x == number then
        disp("YOU ARE THE WINNER");
        return
    else
        diff= abs(number - x);
               
        if diff == 1
            disp("HOT");
        elseif diff ==2
            disp("WARM");
        elseif diff >2
            disp("COLD");
        end
        if n==3 
            disp("--- The End Of The Game ---")
            disp("The Number is "+ string(number));
            disp("BETTER LUCK NEXT TIME") ;
        end
    end     
end
endfunction
