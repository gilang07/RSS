package com.example.retrofit.Model;

import com.example.retrofit.Model.Feed;
import com.example.retrofit.Model.Item;

import java.util.List;




/*public class Enclosure
{
    public string link { get; set; }
    public string type { get; set; }
    public int length { get; set; }
}*/


public class RssObject
{
    public String status ;
    public Feed feed;
    public List<Item> items ;

    public RssObject(String status, Feed feed, List<Item> items) {
        this.status = status;
        this.feed = feed;
        this.items = items;
    }

    public String getStatus() {
        return status;
    }

    public Feed getFeed() {
        return feed;
    }

    public List<Item> getItems() {
        return items;
    }
}