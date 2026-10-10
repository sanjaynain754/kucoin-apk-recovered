package shark.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.UShort;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DoubleCompanionObject;
import p852kotlin.jvm.internal.FloatCompanionObject;
import shark.AbstractC44490l;
import shark.PrimitiveType;
import shark.ValueHolder;

/* JADX INFO: compiled from: ClassFieldsReader.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\n*\u0001\u001b\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002#\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u001b\u0010\u0018\u001a\u0017\u0012\b\u0012\u00060\u0016R\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0002\b\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m90084d2 = {"Lshark/internal/ClassFieldsReader;", "", "", "identifierByteSize", "", "classFieldBytes", "<init>", "(I[B)V", "Lshark/internal/h$a;", "indexedClass", "", "Lshark/l$b$c$a$b;", "m", "(Lshark/internal/h$a;)Ljava/util/List;", "Lshark/l$b$c$a$a;", "k", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lshark/internal/h$a;)Z", "R", "initialPosition", "Lkotlin/Function1;", "Lshark/internal/ClassFieldsReader$a;", "Lkotlin/ExtensionFunctionType;", "block", "n", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "shark/internal/ClassFieldsReader$b", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lshark/internal/ClassFieldsReader$b;", "readInFlightThreadLocal", "b", "I", "c", "[B", "Companion", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class ClassFieldsReader {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final C44458b readInFlightThreadLocal = new C44458b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int identifierByteSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final byte[] classFieldBytes;

    /* JADX INFO: renamed from: d */
    public static final int f98288d = PrimitiveType.BOOLEAN.getHprofType();

    /* JADX INFO: renamed from: e */
    public static final int f98289e = PrimitiveType.CHAR.getHprofType();

    /* JADX INFO: renamed from: f */
    public static final int f98290f = PrimitiveType.FLOAT.getHprofType();

    /* JADX INFO: renamed from: g */
    public static final int f98291g = PrimitiveType.DOUBLE.getHprofType();

    /* JADX INFO: renamed from: h */
    public static final int f98292h = PrimitiveType.BYTE.getHprofType();

    /* JADX INFO: renamed from: i */
    public static final int f98293i = PrimitiveType.SHORT.getHprofType();

    /* JADX INFO: renamed from: j */
    public static final int f98294j = PrimitiveType.INT.getHprofType();

    /* JADX INFO: renamed from: k */
    public static final int f98295k = PrimitiveType.LONG.getHprofType();

    /* JADX INFO: renamed from: shark.internal.ClassFieldsReader$a */
    /* JADX INFO: compiled from: ClassFieldsReader.kt */
    @Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0010J\r\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0010J\r\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u0013J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%R\"\u0010*\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b&\u0010\u0010\"\u0004\b(\u0010)¨\u0006+"}, m90084d2 = {"Lshark/internal/ClassFieldsReader$a;", "", "<init>", "(Lshark/internal/ClassFieldsReader;)V", "", "o", "()V", "", "type", "Lshark/ValueHolder;", "m", "(I)Lshark/ValueHolder;", "", "c", "()B", CmcdData.Factory.STREAMING_FORMAT_HLS, "()I", "", "i", "()J", "", "j", "()S", CmcdData.Factory.STREAM_TYPE_LIVE, "k", "g", "", "b", "()Z", "", "d", "()C", "", "f", "()F", "", "e", "()D", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "n", "(I)V", ViewProps.POSITION, "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
    public final class C44457a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public int position;

        @NotNull
        /* JADX INFO: renamed from: m */
        public final ValueHolder m98204m(int type) {
            if (type == 2) {
                return new ValueHolder.ReferenceHolder(m98198g());
            }
            if (type == ClassFieldsReader.f98288d) {
                return new ValueHolder.BooleanHolder(m98193b());
            }
            if (type == ClassFieldsReader.f98289e) {
                return new ValueHolder.CharHolder(m98195d());
            }
            if (type == ClassFieldsReader.f98290f) {
                return new ValueHolder.FloatHolder(m98197f());
            }
            if (type == ClassFieldsReader.f98291g) {
                return new ValueHolder.DoubleHolder(m98196e());
            }
            if (type == ClassFieldsReader.f98292h) {
                return new ValueHolder.ByteHolder(m98194c());
            }
            if (type == ClassFieldsReader.f98293i) {
                return new ValueHolder.ShortHolder(m98201j());
            }
            if (type == ClassFieldsReader.f98294j) {
                return new ValueHolder.IntHolder(m98199h());
            }
            if (type == ClassFieldsReader.f98295k) {
                return new ValueHolder.LongHolder(m98200i());
            }
            throw new IllegalStateException("Unknown type " + type);
        }

        public C44457a() {
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        /* JADX INFO: renamed from: c */
        public final byte m98194c() {
            byte[] bArr = ClassFieldsReader.this.classFieldBytes;
            int i11 = this.position;
            this.position = i11 + 1;
            return bArr[i11];
        }

        /* JADX INFO: renamed from: e */
        public final double m98196e() {
            DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
            return Double.longBitsToDouble(m98200i());
        }

        /* JADX INFO: renamed from: f */
        public final float m98197f() {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat(m98199h());
        }

        /* JADX INFO: renamed from: g */
        public final long m98198g() {
            int iM98194c;
            int i11 = ClassFieldsReader.this.identifierByteSize;
            if (i11 == 1) {
                iM98194c = m98194c();
            } else if (i11 == 2) {
                iM98194c = m98201j();
            } else {
                if (i11 != 4) {
                    if (i11 == 8) {
                        return m98200i();
                    }
                    throw new IllegalArgumentException("ID Length must be 1, 2, 4, or 8");
                }
                iM98194c = m98199h();
            }
            return iM98194c;
        }

        /* JADX INFO: renamed from: h */
        public final int m98199h() {
            byte[] bArr = ClassFieldsReader.this.classFieldBytes;
            int i11 = this.position;
            this.position = i11 + 1;
            int i12 = (bArr[i11] & 255) << 24;
            byte[] bArr2 = ClassFieldsReader.this.classFieldBytes;
            int i13 = this.position;
            this.position = i13 + 1;
            int i14 = i12 | ((bArr2[i13] & 255) << 16);
            byte[] bArr3 = ClassFieldsReader.this.classFieldBytes;
            int i15 = this.position;
            this.position = i15 + 1;
            int i16 = i14 | ((bArr3[i15] & 255) << 8);
            byte[] bArr4 = ClassFieldsReader.this.classFieldBytes;
            int i17 = this.position;
            this.position = i17 + 1;
            return i16 | (bArr4[i17] & 255);
        }

        /* JADX INFO: renamed from: i */
        public final long m98200i() {
            byte[] bArr = ClassFieldsReader.this.classFieldBytes;
            int i11 = this.position;
            this.position = i11 + 1;
            long j11 = (((long) bArr[i11]) & 255) << 56;
            byte[] bArr2 = ClassFieldsReader.this.classFieldBytes;
            int i12 = this.position;
            this.position = i12 + 1;
            long j12 = j11 | ((((long) bArr2[i12]) & 255) << 48);
            byte[] bArr3 = ClassFieldsReader.this.classFieldBytes;
            int i13 = this.position;
            this.position = i13 + 1;
            long j13 = j12 | ((((long) bArr3[i13]) & 255) << 40);
            byte[] bArr4 = ClassFieldsReader.this.classFieldBytes;
            int i14 = this.position;
            this.position = i14 + 1;
            long j14 = j13 | ((((long) bArr4[i14]) & 255) << 32);
            byte[] bArr5 = ClassFieldsReader.this.classFieldBytes;
            int i15 = this.position;
            this.position = i15 + 1;
            long j15 = j14 | ((((long) bArr5[i15]) & 255) << 24);
            byte[] bArr6 = ClassFieldsReader.this.classFieldBytes;
            int i16 = this.position;
            this.position = i16 + 1;
            long j16 = j15 | ((((long) bArr6[i16]) & 255) << 16);
            byte[] bArr7 = ClassFieldsReader.this.classFieldBytes;
            int i17 = this.position;
            this.position = i17 + 1;
            long j17 = j16 | ((((long) bArr7[i17]) & 255) << 8);
            byte[] bArr8 = ClassFieldsReader.this.classFieldBytes;
            int i18 = this.position;
            this.position = i18 + 1;
            return j17 | (255 & ((long) bArr8[i18]));
        }

        /* JADX INFO: renamed from: j */
        public final short m98201j() {
            byte[] bArr = ClassFieldsReader.this.classFieldBytes;
            int i11 = this.position;
            this.position = i11 + 1;
            int i12 = (bArr[i11] & 255) << 8;
            byte[] bArr2 = ClassFieldsReader.this.classFieldBytes;
            int i13 = this.position;
            this.position = i13 + 1;
            return (short) (i12 | (bArr2[i13] & 255));
        }

        /* JADX INFO: renamed from: n */
        public final void m98205n(int i11) {
            this.position = i11;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m98193b() {
            if (m98194c() != 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: renamed from: d */
        public final char m98195d() {
            return (char) m98201j();
        }

        /* JADX INFO: renamed from: k */
        public final int m98202k() {
            return m98194c() & 255;
        }

        /* JADX INFO: renamed from: l */
        public final int m98203l() {
            return m98201j() & UShort.MAX_VALUE;
        }

        /* JADX INFO: renamed from: o */
        public final void m98206o() {
            int iIntValue;
            int iM98203l = m98203l();
            for (int i11 = 0; i11 < iM98203l; i11++) {
                this.position += ClassFieldsReader.this.identifierByteSize;
                int iM98202k = m98202k();
                int i12 = this.position;
                if (iM98202k == 2) {
                    iIntValue = ClassFieldsReader.this.identifierByteSize;
                } else {
                    iIntValue = ((Number) MapsKt.getValue(PrimitiveType.INSTANCE.getByteSizeByHprofType(), Integer.valueOf(iM98202k))).intValue();
                }
                this.position = i12 + iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: shark.internal.ClassFieldsReader$b */
    /* JADX INFO: compiled from: ClassFieldsReader.kt */
    @Metadata(m90083d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\u0013\u0010\u0004\u001a\u00060\u0002R\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"shark/internal/ClassFieldsReader$b", "Ljava/lang/ThreadLocal;", "Lshark/internal/ClassFieldsReader$a;", "Lshark/internal/ClassFieldsReader;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lshark/internal/ClassFieldsReader$a;", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class C44458b extends ThreadLocal<C44457a> {
        public C44458b() {
        }

        @Override // java.lang.ThreadLocal
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C44457a initialValue() {
            return ClassFieldsReader.this.new C44457a();
        }
    }

    /* JADX INFO: renamed from: n */
    public final <R> R m98191n(int initialPosition, Function1<? super C44457a, ? extends R> block) {
        C44457a c44457a = this.readInFlightThreadLocal.get();
        c44457a.m98205n(initialPosition);
        return block.invoke(c44457a);
    }

    public ClassFieldsReader(int i11, @NotNull byte[] bArr) {
        this.identifierByteSize = i11;
        this.classFieldBytes = bArr;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final List<AbstractC44490l.b.c.a.FieldRecord> m98188k(@NotNull AbstractC44475h.a indexedClass) {
        return (List) m98191n(indexedClass.getFieldsIndex(), new Function1<C44457a, ArrayList<AbstractC44490l.b.c.a.FieldRecord>>() { // from class: shark.internal.ClassFieldsReader$classDumpFields$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final ArrayList<AbstractC44490l.b.c.a.FieldRecord> invoke(@NotNull ClassFieldsReader.C44457a c44457a) {
                c44457a.m98206o();
                int iM98203l = c44457a.m98203l();
                ArrayList<AbstractC44490l.b.c.a.FieldRecord> arrayList = new ArrayList<>(iM98203l);
                for (int i11 = 0; i11 < iM98203l; i11++) {
                    arrayList.add(new AbstractC44490l.b.c.a.FieldRecord(c44457a.m98198g(), c44457a.m98202k()));
                }
                return arrayList;
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final boolean m98189l(@NotNull AbstractC44475h.a indexedClass) {
        return ((Boolean) m98191n(indexedClass.getFieldsIndex(), new Function1<C44457a, Boolean>() { // from class: shark.internal.ClassFieldsReader$classDumpHasReferenceFields$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(ClassFieldsReader.C44457a c44457a) {
                return Boolean.valueOf(invoke2(c44457a));
            }

            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(@NotNull ClassFieldsReader.C44457a c44457a) {
                c44457a.m98206o();
                int iM98203l = c44457a.m98203l();
                for (int i11 = 0; i11 < iM98203l; i11++) {
                    c44457a.m98205n(c44457a.getPosition() + this.this$0.identifierByteSize);
                    if (c44457a.m98202k() == 2) {
                        return true;
                    }
                }
                return false;
            }
        })).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final List<AbstractC44490l.b.c.a.StaticFieldRecord> m98190m(@NotNull AbstractC44475h.a indexedClass) {
        return (List) m98191n(indexedClass.getFieldsIndex(), new Function1<C44457a, ArrayList<AbstractC44490l.b.c.a.StaticFieldRecord>>() { // from class: shark.internal.ClassFieldsReader$classDumpStaticFields$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final ArrayList<AbstractC44490l.b.c.a.StaticFieldRecord> invoke(@NotNull ClassFieldsReader.C44457a c44457a) {
                int iM98203l = c44457a.m98203l();
                ArrayList<AbstractC44490l.b.c.a.StaticFieldRecord> arrayList = new ArrayList<>(iM98203l);
                for (int i11 = 0; i11 < iM98203l; i11++) {
                    long jM98198g = c44457a.m98198g();
                    int iM98202k = c44457a.m98202k();
                    arrayList.add(new AbstractC44490l.b.c.a.StaticFieldRecord(jM98198g, iM98202k, c44457a.m98204m(iM98202k)));
                }
                return arrayList;
            }
        });
    }
}
