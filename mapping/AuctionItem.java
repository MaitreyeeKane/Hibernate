package in.co.rays.mapping;
import java.util.Set;
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