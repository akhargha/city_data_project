class Link<E>{
    private City element;
    private Link<E> next;

    Link(City it, Link<E> nextval){
        element = it;
        next = nextval;
    }

    Link(Link<E> nextval){
        next = nextval;
    }

    Link<E> next(){
        return next;
    }

    Link<E> setNext(Link<E> nextval){
        return next = nextval;
    }

    City element(){
        return element;
    }

    City setElement(City it){
        return element = it;
    }
}

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

    public void delete(String name, String state){
        curr = head;
        curr = curr.next();
        for (int i = 0; i < cnt; i++){
            if (curr.element().getCName().equals(name)){
                if (curr.element().getSName().equals(state)){
                    curr = head;
                    for (int j = 0; j < i; j++){
                        curr = curr.next();
                    }
                    if (tail == curr.next()) tail = curr; // Removed last
                    curr.setNext(curr.next().next());     // Remove from list
                    cnt--;
                }
            }
            curr = curr.next();
        }
    }

    public void delete(double lat, double lon){
        curr = head;
        curr = curr.next();
        for (int i = 0; i < cnt; i++){
            if (Double.compare(curr.element().getLat(),lat)==0){
                if (Double.compare(curr.element().getLong(),lon)==0){
                    curr = head;
                    for (int j = 0; j < i; j++){
                        curr = curr.next();
                    }
                    if (tail == curr.next()) tail = curr; // Removed last
                    curr.setNext(curr.next().next());     // Remove from list
                    cnt--;
                }
            }
            curr = curr.next();
        }
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

    public void printAllState(String state){
        curr = head;
        curr = curr.next();
        for (int i = 0; i < cnt; i++){
            if (curr.element().getSName().equals(state)){
                System.out.println(curr.element());
            }
            curr = curr.next();
        }
    }

    public void printAllDistance(double lat, double lon, double d){
        curr = head;
        curr = curr.next();
        for (int i = 0; i < cnt; i++){
            if (curr.element().distance(lat, curr.element().getLat(), lon, curr.element().getLong())<=d){
                System.out.println(curr.element());
            }
            curr = curr.next();
        }
    }

    public void printAllPopulation(int from, int to){
        curr = head;
        curr = curr.next();
        for (int i = 0; i < cnt; i++){
            if (curr.element().getPop()>=from && curr.element().getPop()<=to){
                System.out.println(curr.element());
            }
            curr = curr.next();
        }
    }



}