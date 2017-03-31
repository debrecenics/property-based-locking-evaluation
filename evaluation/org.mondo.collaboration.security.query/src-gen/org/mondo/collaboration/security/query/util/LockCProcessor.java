package org.mondo.collaboration.security.query.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.mondo.collaboration.security.query.LockCMatch;
import wt.Signal;

/**
 * A match processor tailored for the org.mondo.collaboration.security.query.lockC pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class LockCProcessor implements IMatchProcessor<LockCMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSignal the value of pattern parameter signal in the currently processed match
   * @param pVendor the value of pattern parameter vendor in the currently processed match
   * @param pFrequency the value of pattern parameter frequency in the currently processed match
   * @param pId the value of pattern parameter id in the currently processed match
   * 
   */
  public abstract void process(final Signal pSignal, final String pVendor, final Integer pFrequency, final String pId);
  
  @Override
  public void process(final LockCMatch match) {
    process(match.getSignal(), match.getVendor(), match.getFrequency(), match.getId());
  }
}
