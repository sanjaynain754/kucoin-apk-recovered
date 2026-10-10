package kr;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: kr.b */
/* JADX INFO: compiled from: ICallAdapterFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jg\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\n\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u0001\"\b\b\u0002\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0007H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lkr/b;", "", "ResponseIn", "ResponseOut", "ResponseStream", "Ljava/lang/reflect/Type;", "type", "Lkotlin/Function1;", "Lkr/c;", "convertBuilder", "Lkr/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/reflect/Type;Lkotlin/jvm/functions/Function1;)Lkr/a;", "network-adapter-restful_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC41974b {
    @NotNull
    /* JADX INFO: renamed from: a */
    <ResponseIn, ResponseOut, ResponseStream> InterfaceC41973a<ResponseIn, ResponseOut, ResponseStream> mo85874a(@NotNull Type type, @NotNull Function1<? super Type, ? extends InterfaceC41975c<ResponseIn, ResponseOut>> convertBuilder);
}
