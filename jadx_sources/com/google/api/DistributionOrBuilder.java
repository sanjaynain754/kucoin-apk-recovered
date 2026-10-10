package com.google.api;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
public interface DistributionOrBuilder extends MessageLiteOrBuilder {
    long getBucketCounts(int i11);

    int getBucketCountsCount();

    List<Long> getBucketCountsList();

    Distribution.BucketOptions getBucketOptions();

    long getCount();

    Distribution.Exemplar getExemplars(int i11);

    int getExemplarsCount();

    List<Distribution.Exemplar> getExemplarsList();

    double getMean();

    Distribution.Range getRange();

    double getSumOfSquaredDeviation();

    boolean hasBucketOptions();

    boolean hasRange();
}
