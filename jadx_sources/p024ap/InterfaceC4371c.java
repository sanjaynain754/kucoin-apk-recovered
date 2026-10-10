package p024ap;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.search.searchresult.SearchCategory$Companion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: ap.c */
/* JADX INFO: compiled from: BizScene.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0011R\u0018\u0010\u0003\u001a\u00020\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u00020\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0018\u0010\f\u001a\u00028\u0000X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0001\u0001\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/margin/bizstore/BizScene;", ExifInterface.GPS_DIRECTION_TRUE, "", "category", "", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "key", "getKey", "setKey", "defaultValue", "getDefaultValue", "()Ljava/lang/Object;", "setDefaultValue", "(Ljava/lang/Object;)V", "MarginOfflineTipBanner", "Lcom/kubi/margin/bizstore/BizScene$MarginOfflineTipBanner;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC4371c<T> {

    /* JADX INFO: renamed from: ap.c$a */
    /* JADX INFO: compiled from: BizScene.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0002HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0002X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0002X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0002X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/margin/bizstore/BizScene$MarginOfflineTipBanner;", "Lcom/kubi/margin/bizstore/BizScene;", "", "<init>", "()V", "category", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "key", "getKey", "setKey", "defaultValue", "getDefaultValue", "setDefaultValue", "equals", "", "other", "", "hashCode", "", "toString", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class a implements InterfaceC4371c<String> {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final a f3766a = new a();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static String f3767b = SearchCategory$Companion.SPOT;

        /* JADX INFO: renamed from: c */
        @NotNull
        public static String f3768c = "TipBanner";

        /* JADX INFO: renamed from: d */
        @NotNull
        public static String f3769d = "";

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof a);
        }

        @Override // p024ap.InterfaceC4371c
        @NotNull
        /* JADX INFO: renamed from: a */
        public String mo3897a() {
            return f3767b;
        }

        @Override // p024ap.InterfaceC4371c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String getDefaultValue() {
            return f3769d;
        }

        @Override // p024ap.InterfaceC4371c
        @NotNull
        public String getKey() {
            return f3768c;
        }

        @NotNull
        public String toString() {
            return "MarginOfflineTipBanner";
        }

        public int hashCode() {
            return -57039689;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    String mo3897a();

    T getDefaultValue();

    @NotNull
    String getKey();
}
