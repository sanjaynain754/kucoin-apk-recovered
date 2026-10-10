package com.kubi.sdk;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: BaseViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \n*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/sdk/AbsentLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/lifecycle/LiveData;", "post", "<init>", "(Ljava/lang/Object;)V", "getPost", "()Ljava/lang/Object;", "Ljava/lang/Object;", "Companion", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AbsentLiveData<T> extends LiveData<T> {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f46342b = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final T f46343a;

    /* JADX INFO: compiled from: BaseViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u0002H\u0006¢\u0006\u0002\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/sdk/AbsentLiveData$Companion;", "", "<init>", "()V", "create", "Landroidx/lifecycle/LiveData;", ExifInterface.GPS_DIRECTION_TRUE, "defaultValue", "(Ljava/lang/Object;)Landroidx/lifecycle/LiveData;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final <T> LiveData<T> create(T defaultValue) {
            return new AbsentLiveData(defaultValue, null);
        }
    }

    public /* synthetic */ AbsentLiveData(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj);
    }

    public AbsentLiveData(T t11) {
        this.f46343a = t11;
        postValue(t11);
    }
}
