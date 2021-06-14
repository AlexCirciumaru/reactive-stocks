package org.kan.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Quote {
	private String symbol;
	private String companyName;
	private String primaryExchange;
	private String sector;
	private String calculationPrice;
	private double open;
	private long openTime;
	private double close;
	private long closeTime;
	private double latestPrice;
	private String latestSource;
	private String latestTime;
	@JsonFormat(shape = JsonFormat.Shape.NUMBER, pattern = "s")
	private Date latestUpdate;
	private long latestVolume;
	private double iexRealtimePrice;
	private long iexRealtimeSize;
	@JsonFormat(shape = JsonFormat.Shape.NUMBER, pattern = "s")
	private Date iexLastUpdated;
	private double delayedPrice;
	private long delayedPriceTime;
	private double previousClose;
	private double change;
	private double changePercent;
	private double iexMarketPercent;
	private long iexVolume;
	private long avgTotalVolume;
	private double iexBidPrice;
	private double iexBidSize;
	private double iexAskPrice;
	private double iexAskSize;
	private long marketCap;
	private double peRatio;
	private double week52High;
	private double week52Low;
	private double ytdChange;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPrimaryExchange() {
		return primaryExchange;
	}

	public void setPrimaryExchange(String primaryExchange) {
		this.primaryExchange = primaryExchange;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getCalculationPrice() {
		return calculationPrice;
	}

	public void setCalculationPrice(String calculationPrice) {
		this.calculationPrice = calculationPrice;
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public long getOpenTime() {
		return openTime;
	}

	public void setOpenTime(long openTime) {
		this.openTime = openTime;
	}

	public double getClose() {
		return close;
	}

	public void setClose(double close) {
		this.close = close;
	}

	public long getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(long closeTime) {
		this.closeTime = closeTime;
	}

	public double getLatestPrice() {
		return latestPrice;
	}

	public void setLatestPrice(double latestPrice) {
		this.latestPrice = latestPrice;
	}

	public String getLatestSource() {
		return latestSource;
	}

	public void setLatestSource(String latestSource) {
		this.latestSource = latestSource;
	}

	public String getLatestTime() {
		return latestTime;
	}

	public void setLatestTime(String latestTime) {
		this.latestTime = latestTime;
	}

	public Date getLatestUpdate() {
		return latestUpdate;
	}

	public void setLatestUpdate(Date latestUpdate) {
		this.latestUpdate = latestUpdate;
	}

	public long getLatestVolume() {
		return latestVolume;
	}

	public void setLatestVolume(long latestVolume) {
		this.latestVolume = latestVolume;
	}

	public double getIexRealtimePrice() {
		return iexRealtimePrice;
	}

	public void setIexRealtimePrice(double iexRealtimePrice) {
		this.iexRealtimePrice = iexRealtimePrice;
	}

	public long getIexRealtimeSize() {
		return iexRealtimeSize;
	}

	public void setIexRealtimeSize(long iexRealtimeSize) {
		this.iexRealtimeSize = iexRealtimeSize;
	}

	public Date getIexLastUpdated() {
		return iexLastUpdated;
	}

	public void setIexLastUpdated(Date iexLastUpdated) {
		this.iexLastUpdated = iexLastUpdated;
	}

	public double getDelayedPrice() {
		return delayedPrice;
	}

	public void setDelayedPrice(double delayedPrice) {
		this.delayedPrice = delayedPrice;
	}

	public long getDelayedPriceTime() {
		return delayedPriceTime;
	}

	public void setDelayedPriceTime(long delayedPriceTime) {
		this.delayedPriceTime = delayedPriceTime;
	}

	public double getPreviousClose() {
		return previousClose;
	}

	public void setPreviousClose(double previousClose) {
		this.previousClose = previousClose;
	}

	public double getChange() {
		return change;
	}

	public void setChange(double change) {
		this.change = change;
	}

	public double getChangePercent() {
		return changePercent;
	}

	public void setChangePercent(double changePercent) {
		this.changePercent = changePercent;
	}

	public double getIexMarketPercent() {
		return iexMarketPercent;
	}

	public void setIexMarketPercent(double iexMarketPercent) {
		this.iexMarketPercent = iexMarketPercent;
	}

	public long getIexVolume() {
		return iexVolume;
	}

	public void setIexVolume(long iexVolume) {
		this.iexVolume = iexVolume;
	}

	public long getAvgTotalVolume() {
		return avgTotalVolume;
	}

	public void setAvgTotalVolume(long avgTotalVolume) {
		this.avgTotalVolume = avgTotalVolume;
	}

	public double getIexBidPrice() {
		return iexBidPrice;
	}

	public void setIexBidPrice(double iexBidPrice) {
		this.iexBidPrice = iexBidPrice;
	}

	public double getIexBidSize() {
		return iexBidSize;
	}

	public void setIexBidSize(double iexBidSize) {
		this.iexBidSize = iexBidSize;
	}

	public double getIexAskPrice() {
		return iexAskPrice;
	}

	public void setIexAskPrice(double iexAskPrice) {
		this.iexAskPrice = iexAskPrice;
	}

	public double getIexAskSize() {
		return iexAskSize;
	}

	public void setIexAskSize(double iexAskSize) {
		this.iexAskSize = iexAskSize;
	}

	public long getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(long marketCap) {
		this.marketCap = marketCap;
	}

	public double getPeRatio() {
		return peRatio;
	}

	public void setPeRatio(double peRatio) {
		this.peRatio = peRatio;
	}

	public double getWeek52High() {
		return week52High;
	}

	public void setWeek52High(double week52High) {
		this.week52High = week52High;
	}

	public double getWeek52Low() {
		return week52Low;
	}

	public void setWeek52Low(double week52Low) {
		this.week52Low = week52Low;
	}

	public double getYtdChange() {
		return ytdChange;
	}

	public void setYtdChange(double ytdChange) {
		this.ytdChange = ytdChange;
	}
}
