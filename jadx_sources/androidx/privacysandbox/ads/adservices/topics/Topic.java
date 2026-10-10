package androidx.privacysandbox.ads.adservices.topics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: Topic.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/topics/Topic;", "", "taxonomyVersion", "", "modelVersion", "topicId", "", "(JJI)V", "getModelVersion", "()J", "getTaxonomyVersion", "getTopicId", "()I", "equals", "", "other", "hashCode", "toString", "", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class Topic {

    /* JADX INFO: renamed from: modelVersion, reason: from kotlin metadata and from toString */
    private final long ModelVersion;

    /* JADX INFO: renamed from: taxonomyVersion, reason: from kotlin metadata and from toString */
    private final long TaxonomyVersion;

    /* JADX INFO: renamed from: topicId, reason: from kotlin metadata and from toString */
    private final int TopicCode;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Topic)) {
            return false;
        }
        Topic topic = (Topic) other;
        return this.TaxonomyVersion == topic.TaxonomyVersion && this.ModelVersion == topic.ModelVersion && this.TopicCode == topic.TopicCode;
    }

    public final long getModelVersion() {
        return this.ModelVersion;
    }

    public final long getTaxonomyVersion() {
        return this.TaxonomyVersion;
    }

    /* JADX INFO: renamed from: getTopicId, reason: from getter */
    public final int getTopicCode() {
        return this.TopicCode;
    }

    public int hashCode() {
        return (((Long.hashCode(this.TaxonomyVersion) * 31) + Long.hashCode(this.ModelVersion)) * 31) + Integer.hashCode(this.TopicCode);
    }

    @NotNull
    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.TaxonomyVersion + ", ModelVersion=" + this.ModelVersion + ", TopicCode=" + this.TopicCode + " }");
    }

    public Topic(long j11, long j12, int i11) {
        this.TaxonomyVersion = j11;
        this.ModelVersion = j12;
        this.TopicCode = i11;
    }
}
