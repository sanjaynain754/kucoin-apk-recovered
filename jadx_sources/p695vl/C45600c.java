package p695vl;

import com.kubi.kucoin.widget.upload.RxUpload;
import io.reactivex.functions.Function;
import okhttp3.MultipartBody;

/* JADX INFO: renamed from: vl.c */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class C45600c implements Function {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RxUpload f102724b;

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        return RxUpload.a(this.f102724b, (MultipartBody.Part) obj);
    }
}
