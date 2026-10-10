package com.kubi.network.socket.socketio;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.socket.utils.C19386b;
import com.kubi.network.socket.utils.C19387c;
import com.tencent.bugly.proguard.C33820nf;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.network.socket.socketio.g */
/* JADX INFO: compiled from: SocketIOParser.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/network/socket/socketio/g;", "", "<init>", "()V", "Lcom/kubi/network/socket/socketio/d;", "obj", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/socket/socketio/d;)[Ljava/lang/Object;", "", "c", "(Lcom/kubi/network/socket/socketio/d;)Ljava/lang/String;", "b", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSocketIOParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketIOParser.kt\ncom/kubi/network/socket/socketio/SocketIOParser$Encoder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,127:1\n37#2,2:128\n*S KotlinDebug\n*F\n+ 1 SocketIOParser.kt\ncom/kubi/network/socket/socketio/SocketIOParser$Encoder\n*L\n57#1:128,2\n*E\n"})
public final class C19376g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C19376g f36116a = new C19376g();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Object[] m43013a(@NotNull C19373d<?> obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if ((obj.getType() == 2 || obj.getType() == 3) && C19386b.m43047a(obj.m42997b())) {
            obj.m43005j(obj.getType() == 2 ? 5 : 6);
        }
        return (5 == obj.getType() || 6 == obj.getType()) ? m43014b(obj) : new Object[]{m43015c(obj)};
    }

    /* JADX INFO: renamed from: b */
    public final Object[] m43014b(C19373d<Object> obj) {
        C19371b<?> c19371bM43050c = C19387c.f36149a.m43050c(obj);
        String strM43015c = m43015c(c19371bM43050c.m42995b());
        ArrayList arrayList = new ArrayList(CollectionsKt.listOf(c19371bM43050c.getBuffers()));
        arrayList.add(0, strM43015c);
        return arrayList.toArray(new Object[0]);
    }

    /* JADX INFO: renamed from: c */
    public final String m43015c(C19373d<?> obj) {
        StringBuilder sb2 = new StringBuilder("" + obj.getType());
        if (5 == obj.getType() || 6 == obj.getType()) {
            sb2.append(obj.getAttachments());
            sb2.append(C33820nf.f71144W);
        }
        if (obj.getNsp() != null) {
            String nsp = obj.getNsp();
            Intrinsics.checkNotNull(nsp);
            if (nsp.length() > 0 && !Intrinsics.areEqual("/", obj.getNsp())) {
                sb2.append(obj.getNsp());
                sb2.append(",");
            }
        }
        if (obj.getId() != null) {
            Integer id2 = obj.getId();
            Intrinsics.checkNotNull(id2);
            if (id2.intValue() >= 0) {
                sb2.append(obj.getId());
            }
        }
        if (obj.m42997b() != null) {
            sb2.append(obj.m42997b());
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "str.toString()");
        return string;
    }
}
