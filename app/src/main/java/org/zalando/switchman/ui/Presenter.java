package org.zalando.switchman.ui;

import org.zalando.switchman.data.RecommendationDataSource;
import org.zalando.switchman.data.SearchDataSource;

import rx.subscriptions.CompositeSubscription;

public class Presenter {
    private RecommendationDataSource recommendationDataSource;

    public RecommendationDataSource getRecommendationDataSource() {
        return recommendationDataSource;
    }

    public void setRecommendationDataSource(RecommendationDataSource recommendationDataSource) {
        this.recommendationDataSource = recommendationDataSource;
    }

    private SearchDataSource searchDataSource;

    public SearchDataSource getSearchDataSource() {
        return searchDataSource;
    }

    public void setSearchDataSource(SearchDataSource searchDataSource) {
        this.searchDataSource = searchDataSource;
    }

    private CompositeSubscription subscription = new CompositeSubscription();

    public CompositeSubscription getSubscription() {
        return subscription;
    }

    public Presenter() {
    }
}