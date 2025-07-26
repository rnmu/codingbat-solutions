public boolean loneTeen(int a, int b) {

    // if both a and b in  teen range (13 to 20)
    if( (a >= 13 && a <= 19) && (b >= 13 && b <= 19)){
        return false;

        // if only one of a and b in teen range
    }else if( (a >= 13 && a <= 19) || (b >= 13 && b <= 19)){
        return true;

    }else{
        return false;
    }
}