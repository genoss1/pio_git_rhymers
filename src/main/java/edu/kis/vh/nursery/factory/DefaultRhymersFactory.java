package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FifoRhymer;
import edu.kis.vh.nursery.HanoiRhymer;

/**
 * DefaultRhymersFactory class implements methods from Rhymersfactory interface
 */
public class DefaultRhymersFactory implements RhymersFactory {
	/**
	 * getStandardRhymer()
	 * @return new DefaultCountingOutRhymer object
	 */
	@Override
	public DefaultCountingOutRhymer getStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}
	/**
	 * getFalseRhymer()
	 * @return new DefaultCountingOutRhymer object
	 */
	@Override
	public DefaultCountingOutRhymer getFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}
	/**
	 * getFIFORhymer()
	 * @return new FIFORhymer object
	 */
	@Override
	public DefaultCountingOutRhymer getFifoRhymer() {
		return new FifoRhymer();
	}
	/**
	 * getHanoiRhymer()
	 * @return new HanoiRhymer object
	 */
	@Override
	public DefaultCountingOutRhymer getHanoiRhymer() {
		return new HanoiRhymer();
	}

}
