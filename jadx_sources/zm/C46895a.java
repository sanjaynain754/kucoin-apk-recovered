package zm;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.sdk.base.entity.BaseEntity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zm.a */
/* JADX INFO: compiled from: KWebUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0000¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"toEntity", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/sdk/base/entity/BaseEntity;", "(Lcom/kubi/sdk/base/entity/BaseEntity;)Ljava/lang/Object;", "KWebLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46895a {
    /* JADX INFO: renamed from: a */
    public static final <T> T m103288a(@NotNull BaseEntity<T> baseEntity) throws ApiException {
        Intrinsics.checkNotNullParameter(baseEntity, "<this>");
        if (baseEntity.getSuccess()) {
            return baseEntity.getData();
        }
        throw new ApiException(baseEntity.getCode(), baseEntity.getMsg(), baseEntity.getData());
    }
}
