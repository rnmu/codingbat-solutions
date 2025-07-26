public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    if(aSmile == true && bSmile == false ){
        return false;
    }else if (aSmile == false && bSmile == true ){
        return false;
    }else{
        return true;
    }
}