package p024ap;

import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.kubi.p110rn.Constants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: ap.a */
/* JADX INFO: compiled from: BizMarkActionHelper.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a1\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u0002H\u0000¢\u0006\u0002\u0010\b\u001a)\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0007\u001a\u0002H\u0002H\u0000¢\u0006\u0002\u0010\n\u001a)\u0010\u000b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\f\u001a\u0002H\u0002H\u0000¢\u0006\u0002\u0010\n\u001a1\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u0002H\u0002H\u0000¢\u0006\u0002\u0010\u000f\u001a)\u0010\u0010\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\f\u001a\u0002H\u0002H\u0000¢\u0006\u0002\u0010\u0011\u001a)\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\f\u001a\u0002H\u0002H\u0000¢\u0006\u0002\u0010\u0011¨\u0006\u0013"}, m90084d2 = {"hasMarkBizMMKV", "", ExifInterface.GPS_DIRECTION_TRUE, Constants.BIZ, "Lcom/kubi/margin/bizstore/BizScene;", "model", "Lcom/kubi/margin/bizstore/BizMarkMMKVModel;", "matcher", "(Lcom/kubi/margin/bizstore/BizScene;Lcom/kubi/margin/bizstore/BizMarkMMKVModel;Ljava/lang/Object;)Z", "hasMarkBizMMKVAppendModel", "(Lcom/kubi/margin/bizstore/BizScene;Ljava/lang/Object;)Z", "hasMarkBizMMKVReplaceModel", "value", "markBizMMKV", "", "(Lcom/kubi/margin/bizstore/BizScene;Lcom/kubi/margin/bizstore/BizMarkMMKVModel;Ljava/lang/Object;)V", "markBizMMKVReplaceModel", "(Lcom/kubi/margin/bizstore/BizScene;Ljava/lang/Object;)V", "markBizMMKVAppendModel", "MarginLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBizMarkActionHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BizMarkActionHelper.kt\ncom/kubi/margin/bizstore/BizMarkActionHelperKt\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n172#2:144\n50#2:145\n154#2:146\n32#2:148\n144#2,2:149\n23#2,2:151\n171#2,2:153\n162#2,2:155\n49#2,2:157\n40#2,2:160\n178#3:147\n1#4:159\n*S KotlinDebug\n*F\n+ 1 BizMarkActionHelper.kt\ncom/kubi/margin/bizstore/BizMarkActionHelperKt\n*L\n46#1:144\n51#1:145\n68#1:146\n73#1:148\n107#1:149,2\n111#1:151,2\n128#1:153,2\n129#1:155,2\n134#1:157,2\n136#1:160,2\n68#1:147\n*E\n"})
public final class C4369a {
    /* JADX INFO: renamed from: a */
    public static final <T> boolean m3895a(@NotNull InterfaceC4371c<T> biz, @NotNull InterfaceC4370b model, T t11) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(model, "model");
        if (model instanceof InterfaceC4370b.a) {
            return m3896b(biz, t11);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final <T> boolean m3896b(@NotNull InterfaceC4371c<T> biz, T t11) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        T defaultValue = biz.getDefaultValue();
        if (defaultValue instanceof Parcelable) {
            return CollectionsKt.contains(C46392a.m102325g(new StorageId(biz.mo3897a(), biz.getKey(), null, false, 12, null), CollectionsKt.listOf(defaultValue)), t11 instanceof Parcelable ? (Parcelable) t11 : null);
        }
        if (defaultValue instanceof String) {
            return CollectionsKt.contains(C46392a.m102327i(new StorageId(biz.mo3897a(), biz.getKey(), null, false, 12, null), SetsKt.setOf(defaultValue)), t11 instanceof String ? (String) t11 : null);
        }
        C44128b.m97260d("hasMarkBizMMKVAppendModel, mark fail, T type unsupported.");
        return false;
    }
}
