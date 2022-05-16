package in.co.rays.fetching;
import java.util.Set;

import in.co.rays.mapping.Bid;
public class AuctionItem {
private int id;
private Set<Bid>bids;
private String description;
public  AuctionItem() {}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Set<Bid> getBids() {
	return bids;
}
public void setBids(Set<Bid> bids) {
	this.bids = bids;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}