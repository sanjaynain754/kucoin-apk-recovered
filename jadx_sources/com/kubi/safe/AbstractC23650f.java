package com.kubi.safe;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.kubi.safe.f */
/* JADX INFO: compiled from: KeyChain.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n\u0082\u0001\u0001\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/safe/f;", ExifInterface.GPS_DIRECTION_TRUE, "", "title", "negative", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Lcom/kubi/safe/g;", "keychain_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public abstract class AbstractC23650f<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final T title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final T negative;

    public /* synthetic */ AbstractC23650f(Object obj, Object obj2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2);
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo56362a();

    /* JADX INFO: renamed from: b */
    public abstract T mo56363b();

    public AbstractC23650f(T t11, T t12) {
        this.title = t11;
        this.negative = t12;
    }
}
