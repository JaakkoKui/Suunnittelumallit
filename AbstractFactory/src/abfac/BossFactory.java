package abfac;

public class BossFactory implements TheClothesFactory{


	    @Override
	    public Shirt makeShirt() {
	        return new BossShirt();
	    }

	    @Override
	    public Jeans makeJeans() {
	        return new BossJeans();
	    }

	    @Override
	    public Cap makeCap() {
	        return new BossCap();
	    }

	    @Override
	    public Shoes makeShoes() {
	        return new BossShoes();
	    }
	}
