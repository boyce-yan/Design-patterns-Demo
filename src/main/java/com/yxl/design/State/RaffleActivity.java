package com.yxl.design.State;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/25 21:48
 */
public class RaffleActivity {

    State state;

    int count = 0;

    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }



    public void debuctMoney(){
        state.deductMoney();
    }

    public void raffle(){
        if(state.raffle()){
            state.dispensePrize();
        }
    }

    public int getCount(){
        int curCount = count;
        count-- ;
        return curCount;
    }

    public void setCount(int COunt){
        this.count = count;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    State getNoRaffleState() {
        return noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
