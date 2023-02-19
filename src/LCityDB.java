class LCityDB<E>{
    private Link<E> head;
    private Link<E> tail;
    private Link<E> curr;
    int cnt;

    LCityDB(int size){ this(); }

    LCityDB(){
        curr = tail = head = new Link<E>(null);
        cnt = 0;
    }

    public void insert(City city){
        tail = tail.setNext(new Link<E>(city,null));
        cnt++;
    }

    public void test(){
        curr = head;
        System.out.println(curr.element());
        curr = curr.next();
        System.out.println(curr.element());
    }


    public City search(String name, String state){
        curr = head;
        curr = curr.next();
        for (int i = 0; i < cnt; i++){
            if (curr.element().getCName().equals(name)){
                if (curr.element().getSName().equals(state)){
                    return curr.element();
                }
            }
            curr = curr.next();
        }
        return null;
    }

    public City search(double lat, double lon){
        curr = head;
        curr = curr.next();
        for (int i = 0; i < cnt; i++){
            if (Double.compare(curr.element().getLat(),lat)==0){
                if (Double.compare(curr.element().getLong(),lon)==0){
                    return curr.element();
                }
            }
            curr = curr.next();
        }
        return null;
    }




}