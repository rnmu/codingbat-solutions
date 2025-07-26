public boolean stringE(String str) {
    int count = 0;
    for( int i = 0 ; i < str.length() ;i++){
        if(str.charAt(i) == 'e'){
            count+=1;
        }
    }
    if(count <= 3 && count >0){
        return true;
    }else{
        return false;
    }
}