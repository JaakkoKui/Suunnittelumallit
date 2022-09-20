package abfac;


public class AdidasFactory implements TheClothesFactory{

		@Override	
	    public Shirt makeShirt() {
	        return new AdidasShirt();
	    }

	    @Override
	    public Jeans makeJeans() {
	        return new AdidasJeans();
	    }

	    @Override
	    public Cap makeCap() {
	        return new AdidasCap();
	    }

	    @Override
	    public Shoes makeShoes() {
	        return new AdidasShoes();
	    }
	}
