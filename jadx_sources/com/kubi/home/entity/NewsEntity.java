package com.kubi.home.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.kubi.resources.widget.MarqueeTextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class NewsEntity implements Parcelable, MarqueeTextView.InterfaceC22932e {
    public static final Parcelable.Creator<NewsEntity> CREATOR = new C14553a();

    @SerializedName("first_publish_at")
    private long firstAt;

    /* JADX INFO: renamed from: id */
    private int f25638id;
    private List<String> images;
    private String path;

    @SerializedName("publish_ts")
    private long publishAt;
    private String summary;
    private String title;

    /* JADX INFO: renamed from: com.kubi.home.entity.NewsEntity$a */
    public class C14553a implements Parcelable.Creator<NewsEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NewsEntity createFromParcel(Parcel parcel) {
            return new NewsEntity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NewsEntity[] newArray(int i11) {
            return new NewsEntity[i11];
        }
    }

    public NewsEntity() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public NewsEntity(Parcel parcel) {
        this.f25638id = parcel.readInt();
        this.title = parcel.readString();
        this.path = parcel.readString();
        this.publishAt = parcel.readLong();
        this.images = parcel.createStringArrayList();
        this.summary = parcel.readString();
        this.firstAt = parcel.readLong();
    }

    @Override // com.kubi.resources.widget.MarqueeTextView.InterfaceC22932e
    public String getDisplayString() {
        return this.title;
    }

    public long getFirstAt() {
        return this.firstAt;
    }

    public int getId() {
        return this.f25638id;
    }

    public List<String> getImages() {
        if (this.images == null) {
            this.images = new ArrayList();
        }
        return this.images;
    }

    public String getPath() {
        return this.path;
    }

    public long getPublishAt() {
        return this.publishAt;
    }

    public String getSummary() {
        return this.summary;
    }

    public String getTitle() {
        return this.title;
    }

    public void setFirstAt(long j11) {
        this.firstAt = j11;
    }

    public void setId(int i11) {
        this.f25638id = i11;
    }

    public void setImages(List<String> list) {
        this.images = list;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPublishAt(long j11) {
        this.publishAt = j11;
    }

    public void setSummary(String str) {
        this.summary = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f25638id);
        parcel.writeString(this.title);
        parcel.writeString(this.path);
        parcel.writeLong(this.publishAt);
        parcel.writeStringList(this.images);
        parcel.writeString(this.summary);
        parcel.writeLong(this.firstAt);
    }
}
