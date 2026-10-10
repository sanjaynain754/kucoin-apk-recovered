package com.kubi.home.realtime;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.home.realtime.IRealTimeData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.home.realtime.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ViewLifecycleEvent.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0004\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/home/realtime/ViewLifecycleEvent;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/home/realtime/IRealTimeData;", "", "<init>", "()V", "viewType", "Lcom/kubi/home/realtime/RealTimeViewType;", "getViewType", "()Lcom/kubi/home/realtime/RealTimeViewType;", "data", "getData", "()Lcom/kubi/home/realtime/IRealTimeData;", "dataList", "", "Show", "Hide", "Removed", "DialogShow", "Lcom/kubi/home/realtime/ViewLifecycleEvent$DialogShow;", "Lcom/kubi/home/realtime/ViewLifecycleEvent$Hide;", "Lcom/kubi/home/realtime/ViewLifecycleEvent$Removed;", "Lcom/kubi/home/realtime/ViewLifecycleEvent$Show;", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class ViewLifecycleEvent<T extends IRealTimeData> {

    /* JADX INFO: renamed from: com.kubi.home.realtime.e$a, reason: from toString */
    /* JADX INFO: compiled from: ViewLifecycleEvent.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000e\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0004\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/home/realtime/ViewLifecycleEvent$DialogShow;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/home/realtime/IRealTimeData;", "Lcom/kubi/home/realtime/ViewLifecycleEvent;", "data", "viewType", "Lcom/kubi/home/realtime/RealTimeViewType;", "<init>", "(Lcom/kubi/home/realtime/IRealTimeData;Lcom/kubi/home/realtime/RealTimeViewType;)V", "getData", "()Lcom/kubi/home/realtime/IRealTimeData;", "Lcom/kubi/home/realtime/IRealTimeData;", "getViewType", "()Lcom/kubi/home/realtime/RealTimeViewType;", "component1", "component2", "copy", "(Lcom/kubi/home/realtime/IRealTimeData;Lcom/kubi/home/realtime/RealTimeViewType;)Lcom/kubi/home/realtime/ViewLifecycleEvent$DialogShow;", "equals", "", "other", "", "hashCode", "", "toString", "", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class DialogShow<T extends IRealTimeData> extends ViewLifecycleEvent<T> {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final T data;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final RealTimeViewType viewType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DialogShow)) {
                return false;
            }
            DialogShow dialogShow = (DialogShow) other;
            return Intrinsics.areEqual(this.data, dialogShow.data) && this.viewType == dialogShow.viewType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogShow(@NotNull T data, @NotNull RealTimeViewType viewType) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(viewType, "viewType");
            this.data = data;
            this.viewType = viewType;
        }

        @Override // com.kubi.home.realtime.ViewLifecycleEvent
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public RealTimeViewType getViewType() {
            return this.viewType;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public T m30138b() {
            return this.data;
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + this.viewType.hashCode();
        }

        @NotNull
        public String toString() {
            return "DialogShow(data=" + this.data + ", viewType=" + this.viewType + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.realtime.e$b, reason: from toString */
    /* JADX INFO: compiled from: ViewLifecycleEvent.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000e\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0004\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/home/realtime/ViewLifecycleEvent$Hide;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/home/realtime/IRealTimeData;", "Lcom/kubi/home/realtime/ViewLifecycleEvent;", "data", "viewType", "Lcom/kubi/home/realtime/RealTimeViewType;", "<init>", "(Lcom/kubi/home/realtime/IRealTimeData;Lcom/kubi/home/realtime/RealTimeViewType;)V", "getData", "()Lcom/kubi/home/realtime/IRealTimeData;", "Lcom/kubi/home/realtime/IRealTimeData;", "getViewType", "()Lcom/kubi/home/realtime/RealTimeViewType;", "component1", "component2", "copy", "(Lcom/kubi/home/realtime/IRealTimeData;Lcom/kubi/home/realtime/RealTimeViewType;)Lcom/kubi/home/realtime/ViewLifecycleEvent$Hide;", "equals", "", "other", "", "hashCode", "", "toString", "", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Hide<T extends IRealTimeData> extends ViewLifecycleEvent<T> {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final T data;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final RealTimeViewType viewType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Hide)) {
                return false;
            }
            Hide hide = (Hide) other;
            return Intrinsics.areEqual(this.data, hide.data) && this.viewType == hide.viewType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Hide(@NotNull T data, @NotNull RealTimeViewType viewType) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(viewType, "viewType");
            this.data = data;
            this.viewType = viewType;
        }

        @Override // com.kubi.home.realtime.ViewLifecycleEvent
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public RealTimeViewType getViewType() {
            return this.viewType;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public T m30139b() {
            return this.data;
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + this.viewType.hashCode();
        }

        @NotNull
        public String toString() {
            return "Hide(data=" + this.data + ", viewType=" + this.viewType + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.realtime.e$c, reason: from toString */
    /* JADX INFO: compiled from: ViewLifecycleEvent.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000e\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0004\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/home/realtime/ViewLifecycleEvent$Removed;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/home/realtime/IRealTimeData;", "Lcom/kubi/home/realtime/ViewLifecycleEvent;", "data", "viewType", "Lcom/kubi/home/realtime/RealTimeViewType;", "<init>", "(Lcom/kubi/home/realtime/IRealTimeData;Lcom/kubi/home/realtime/RealTimeViewType;)V", "getData", "()Lcom/kubi/home/realtime/IRealTimeData;", "Lcom/kubi/home/realtime/IRealTimeData;", "getViewType", "()Lcom/kubi/home/realtime/RealTimeViewType;", "component1", "component2", "copy", "(Lcom/kubi/home/realtime/IRealTimeData;Lcom/kubi/home/realtime/RealTimeViewType;)Lcom/kubi/home/realtime/ViewLifecycleEvent$Removed;", "equals", "", "other", "", "hashCode", "", "toString", "", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Removed<T extends IRealTimeData> extends ViewLifecycleEvent<T> {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final T data;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final RealTimeViewType viewType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Removed)) {
                return false;
            }
            Removed removed = (Removed) other;
            return Intrinsics.areEqual(this.data, removed.data) && this.viewType == removed.viewType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Removed(@NotNull T data, @NotNull RealTimeViewType viewType) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(viewType, "viewType");
            this.data = data;
            this.viewType = viewType;
        }

        @Override // com.kubi.home.realtime.ViewLifecycleEvent
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public RealTimeViewType getViewType() {
            return this.viewType;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public T m30140b() {
            return this.data;
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + this.viewType.hashCode();
        }

        @NotNull
        public String toString() {
            return "Removed(data=" + this.data + ", viewType=" + this.viewType + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.realtime.e$d, reason: from toString */
    /* JADX INFO: compiled from: ViewLifecycleEvent.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000e\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0004\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/home/realtime/ViewLifecycleEvent$Show;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/home/realtime/IRealTimeData;", "Lcom/kubi/home/realtime/ViewLifecycleEvent;", "data", "viewType", "Lcom/kubi/home/realtime/RealTimeViewType;", "<init>", "(Lcom/kubi/home/realtime/IRealTimeData;Lcom/kubi/home/realtime/RealTimeViewType;)V", "getData", "()Lcom/kubi/home/realtime/IRealTimeData;", "Lcom/kubi/home/realtime/IRealTimeData;", "getViewType", "()Lcom/kubi/home/realtime/RealTimeViewType;", "component1", "component2", "copy", "(Lcom/kubi/home/realtime/IRealTimeData;Lcom/kubi/home/realtime/RealTimeViewType;)Lcom/kubi/home/realtime/ViewLifecycleEvent$Show;", "equals", "", "other", "", "hashCode", "", "toString", "", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Show<T extends IRealTimeData> extends ViewLifecycleEvent<T> {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final T data;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final RealTimeViewType viewType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Show)) {
                return false;
            }
            Show show = (Show) other;
            return Intrinsics.areEqual(this.data, show.data) && this.viewType == show.viewType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Show(@NotNull T data, @NotNull RealTimeViewType viewType) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(viewType, "viewType");
            this.data = data;
            this.viewType = viewType;
        }

        @Override // com.kubi.home.realtime.ViewLifecycleEvent
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public RealTimeViewType getViewType() {
            return this.viewType;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public T m30141b() {
            return this.data;
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + this.viewType.hashCode();
        }

        @NotNull
        public String toString() {
            return "Show(data=" + this.data + ", viewType=" + this.viewType + ')';
        }
    }

    public /* synthetic */ ViewLifecycleEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract RealTimeViewType getViewType();

    public ViewLifecycleEvent() {
    }
}
