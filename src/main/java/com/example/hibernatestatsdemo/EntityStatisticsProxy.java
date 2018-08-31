/**
 * 
 */
package com.example.hibernatestatsdemo;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

import javax.management.openmbean.CompositeDataSupport;
import javax.management.openmbean.CompositeType;
import javax.management.openmbean.OpenDataException;
import javax.management.openmbean.OpenType;
import javax.management.openmbean.SimpleType;

import org.hibernate.stat.EntityStatistics;

/**
 * @author T111280
 *
 */
public class EntityStatisticsProxy extends CompositeDataSupport implements EntityStatistics, Serializable {

	private static String[] itemNames = {"deleteCount","insertCount","updateCount","loadCount","fetchCount","optimisticFailureCount"};
	private static String[] itemDescriptions = {"deleteCount","insertCount","updateCount","loadCount","fetchCount","optimisticFailureCount"};
	private static OpenType<?>[] itemTypes = { SimpleType.LONG, SimpleType.LONG, SimpleType.LONG, SimpleType.LONG, SimpleType.LONG, SimpleType.LONG};
	private static CompositeType entityStatisticsType = null;
	/* *** Static initialization *** */
	static {
		try {
			entityStatisticsType = new CompositeType("entityStatistics", "ENtity statistics", itemNames, itemDescriptions, itemTypes);
		} catch (OpenDataException e) {
			// convert to a runtime exception
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			PrintWriter pout = new PrintWriter(bout);
			e.printStackTrace(pout);
			pout.flush();
			throw new RuntimeException(bout.toString());
		}
	}
	
	public EntityStatisticsProxy() throws OpenDataException {
		super(entityStatisticsType, itemNames, new Object[] {//
				0l//
				, 0l//
				, 0l//
				, 0l//
				, 0l//
				, 0l//
		});
	}

	public EntityStatisticsProxy(EntityStatistics entityStatistics) throws OpenDataException{
		super(entityStatisticsType, itemNames, new Object[] {//
				entityStatistics.getDeleteCount()//
				, entityStatistics.getInsertCount()//
				, entityStatistics.getUpdateCount()//
				, entityStatistics.getLoadCount()//
				, entityStatistics.getFetchCount()//
				, entityStatistics.getOptimisticFailureCount()//
		});
	}

	@Override
	public String getCacheRegionName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getCachePutCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getCacheHitCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getCacheMissCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getDeleteCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getInsertCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getUpdateCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getLoadCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getFetchCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getOptimisticFailureCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
