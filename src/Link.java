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