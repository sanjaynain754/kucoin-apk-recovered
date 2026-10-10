package androidx.constraintlayout.core.state;

/* JADX INFO: loaded from: classes23.dex */
public class ConstraintSetParser {
    private static final boolean PARSER_DEBUG = false;

    public static class DesignElement {
        java.lang.String mId;
        java.util.HashMap<java.lang.String, java.lang.String> mParams;
        java.lang.String mType;

        public DesignElement(java.lang.String r1, java.lang.String r2, java.util.HashMap<java.lang.String, java.lang.String> r3) {
                r0 = this;
                r0.<init>()
                r0.mId = r1
                r0.mType = r2
                r0.mParams = r3
                return
        }

        public java.lang.String getId() {
                r1 = this;
                java.lang.String r0 = r1.mId
                return r0
        }

        public java.util.HashMap<java.lang.String, java.lang.String> getParams() {
                r1 = this;
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.mParams
                return r0
        }

        public java.lang.String getType() {
                r1 = this;
                java.lang.String r0 = r1.mType
                return r0
        }
    }

    public static class FiniteGenerator implements androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue {
        float mCurrent;
        float mFrom;
        float mInitial;
        float mMax;
        java.lang.String mPostfix;
        java.lang.String mPrefix;
        float mStep;
        boolean mStop;
        float mTo;

        public FiniteGenerator(float r2, float r3, float r4, java.lang.String r5, java.lang.String r6) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mStop = r0
                r0 = 0
                r1.mCurrent = r0
                r1.mFrom = r2
                r1.mTo = r3
                r1.mStep = r4
                java.lang.String r4 = ""
                if (r5 != 0) goto L14
                r5 = r4
            L14:
                r1.mPrefix = r5
                if (r6 != 0) goto L19
                r6 = r4
            L19:
                r1.mPostfix = r6
                r1.mMax = r3
                r1.mInitial = r2
                return
        }

        public java.util.ArrayList<java.lang.String> array() {
                r6 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                float r1 = r6.mInitial
                int r1 = (int) r1
                float r2 = r6.mMax
                int r2 = (int) r2
                r3 = r1
            Lc:
                if (r1 > r2) goto L2e
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = r6.mPrefix
                r4.append(r5)
                r4.append(r3)
                java.lang.String r5 = r6.mPostfix
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r0.add(r4)
                float r4 = r6.mStep
                int r4 = (int) r4
                int r3 = r3 + r4
                int r1 = r1 + 1
                goto Lc
            L2e:
                return r0
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
                r2 = this;
                float r0 = r2.mCurrent
                float r1 = r2.mMax
                int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r1 < 0) goto Lb
                r1 = 1
                r2.mStop = r1
            Lb:
                boolean r1 = r2.mStop
                if (r1 != 0) goto L14
                float r1 = r2.mStep
                float r0 = r0 + r1
                r2.mCurrent = r0
            L14:
                float r0 = r2.mCurrent
                return r0
        }
    }

    public interface GeneratedValue {
        float value();
    }

    public static class Generator implements androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue {
        float mCurrent;
        float mIncrementBy;
        float mStart;
        boolean mStop;

        public Generator(float r2, float r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mStop = r0
                r1.mStart = r2
                r1.mIncrementBy = r3
                r1.mCurrent = r2
                return
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
                r2 = this;
                boolean r0 = r2.mStop
                if (r0 != 0) goto Lb
                float r0 = r2.mCurrent
                float r1 = r2.mIncrementBy
                float r0 = r0 + r1
                r2.mCurrent = r0
            Lb:
                float r0 = r2.mCurrent
                return r0
        }
    }

    public static class LayoutVariables {
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> mArrayIds;
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue> mGenerators;
        java.util.HashMap<java.lang.String, java.lang.Integer> mMargins;

        public LayoutVariables() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mMargins = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mGenerators = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mArrayIds = r0
                return
        }

        public float get(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof androidx.constraintlayout.core.parser.CLString
                if (r0 == 0) goto L34
                androidx.constraintlayout.core.parser.CLString r2 = (androidx.constraintlayout.core.parser.CLString) r2
                java.lang.String r2 = r2.content()
                java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$GeneratedValue> r0 = r1.mGenerators
                boolean r0 = r0.containsKey(r2)
                if (r0 == 0) goto L1f
                java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$GeneratedValue> r0 = r1.mGenerators
                java.lang.Object r2 = r0.get(r2)
                androidx.constraintlayout.core.state.ConstraintSetParser$GeneratedValue r2 = (androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue) r2
                float r2 = r2.value()
                return r2
            L1f:
                java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r1.mMargins
                boolean r0 = r0.containsKey(r2)
                if (r0 == 0) goto L3f
                java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r1.mMargins
                java.lang.Object r2 = r0.get(r2)
                java.lang.Integer r2 = (java.lang.Integer) r2
                float r2 = r2.floatValue()
                return r2
            L34:
                boolean r0 = r2 instanceof androidx.constraintlayout.core.parser.CLNumber
                if (r0 == 0) goto L3f
                androidx.constraintlayout.core.parser.CLNumber r2 = (androidx.constraintlayout.core.parser.CLNumber) r2
                float r2 = r2.getFloat()
                return r2
            L3f:
                r2 = 0
                return r2
        }

        public java.util.ArrayList<java.lang.String> getList(java.lang.String r2) {
                r1 = this;
                java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> r0 = r1.mArrayIds
                boolean r0 = r0.containsKey(r2)
                if (r0 == 0) goto L11
                java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> r0 = r1.mArrayIds
                java.lang.Object r2 = r0.get(r2)
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                return r2
            L11:
                r2 = 0
                return r2
        }

        public void put(java.lang.String r3, float r4, float r5) {
                r2 = this;
                java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$GeneratedValue> r0 = r2.mGenerators
                boolean r0 = r0.containsKey(r3)
                if (r0 == 0) goto L13
                java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$GeneratedValue> r0 = r2.mGenerators
                java.lang.Object r0 = r0.get(r3)
                boolean r0 = r0 instanceof androidx.constraintlayout.core.state.ConstraintSetParser.OverrideValue
                if (r0 == 0) goto L13
                return
            L13:
                java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$GeneratedValue> r0 = r2.mGenerators
                androidx.constraintlayout.core.state.ConstraintSetParser$Generator r1 = new androidx.constraintlayout.core.state.ConstraintSetParser$Generator
                r1.<init>(r4, r5)
                r0.put(r3, r1)
                return
        }

        public void put(java.lang.String r8, float r9, float r10, float r11, java.lang.String r12, java.lang.String r13) {
                r7 = this;
                java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$GeneratedValue> r0 = r7.mGenerators
                boolean r0 = r0.containsKey(r8)
                if (r0 == 0) goto L13
                java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$GeneratedValue> r0 = r7.mGenerators
                java.lang.Object r0 = r0.get(r8)
                boolean r0 = r0 instanceof androidx.constraintlayout.core.state.ConstraintSetParser.OverrideValue
                if (r0 == 0) goto L13
                return
            L13:
                androidx.constraintlayout.core.state.ConstraintSetParser$FiniteGenerator r1 = new androidx.constraintlayout.core.state.ConstraintSetParser$FiniteGenerator
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r1.<init>(r2, r3, r4, r5, r6)
                java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$GeneratedValue> r9 = r7.mGenerators
                r9.put(r8, r1)
                java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> r9 = r7.mArrayIds
                java.util.ArrayList r10 = r1.array()
                r9.put(r8, r10)
                return
        }

        public void put(java.lang.String r2, int r3) {
                r1 = this;
                java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r1.mMargins
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.put(r2, r3)
                return
        }

        public void put(java.lang.String r2, java.util.ArrayList<java.lang.String> r3) {
                r1 = this;
                java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> r0 = r1.mArrayIds
                r0.put(r2, r3)
                return
        }

        public void putOverride(java.lang.String r2, float r3) {
                r1 = this;
                androidx.constraintlayout.core.state.ConstraintSetParser$OverrideValue r0 = new androidx.constraintlayout.core.state.ConstraintSetParser$OverrideValue
                r0.<init>(r3)
                java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$GeneratedValue> r3 = r1.mGenerators
                r3.put(r2, r0)
                return
        }
    }

    public static final enum MotionLayoutDebugFlags extends java.lang.Enum<androidx.constraintlayout.core.state.ConstraintSetParser.MotionLayoutDebugFlags> {
        private static final /* synthetic */ androidx.constraintlayout.core.state.ConstraintSetParser.MotionLayoutDebugFlags[] $VALUES = null;
        public static final androidx.constraintlayout.core.state.ConstraintSetParser.MotionLayoutDebugFlags NONE = null;
        public static final androidx.constraintlayout.core.state.ConstraintSetParser.MotionLayoutDebugFlags SHOW_ALL = null;
        public static final androidx.constraintlayout.core.state.ConstraintSetParser.MotionLayoutDebugFlags UNKNOWN = null;

        private static /* synthetic */ androidx.constraintlayout.core.state.ConstraintSetParser.MotionLayoutDebugFlags[] $values() {
                androidx.constraintlayout.core.state.ConstraintSetParser$MotionLayoutDebugFlags r0 = androidx.constraintlayout.core.state.ConstraintSetParser.MotionLayoutDebugFlags.NONE
                androidx.constraintlayout.core.state.ConstraintSetParser$MotionLayoutDebugFlags r1 = androidx.constraintlayout.core.state.ConstraintSetParser.MotionLayoutDebugFlags.SHOW_ALL
                androidx.constraintlayout.core.state.ConstraintSetParser$MotionLayoutDebugFlags r2 = androidx.constraintlayout.core.state.ConstraintSetParser.MotionLayoutDebugFlags.UNKNOWN
                androidx.constraintlayout.core.state.ConstraintSetParser$MotionLayoutDebugFlags[] r0 = new androidx.constraintlayout.core.state.ConstraintSetParser.MotionLayoutDebugFlags[]{r0, r1, r2}
                return r0
        }

        static {
                androidx.constraintlayout.core.state.ConstraintSetParser$MotionLayoutDebugFlags r0 = new androidx.constraintlayout.core.state.ConstraintSetParser$MotionLayoutDebugFlags
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.core.state.ConstraintSetParser.MotionLayoutDebugFlags.NONE = r0
                androidx.constraintlayout.core.state.ConstraintSetParser$MotionLayoutDebugFlags r0 = new androidx.constraintlayout.core.state.ConstraintSetParser$MotionLayoutDebugFlags
                java.lang.String r1 = "SHOW_ALL"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.constraintlayout.core.state.ConstraintSetParser.MotionLayoutDebugFlags.SHOW_ALL = r0
                androidx.constraintlayout.core.state.ConstraintSetParser$MotionLayoutDebugFlags r0 = new androidx.constraintlayout.core.state.ConstraintSetParser$MotionLayoutDebugFlags
                java.lang.String r1 = "UNKNOWN"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.constraintlayout.core.state.ConstraintSetParser.MotionLayoutDebugFlags.UNKNOWN = r0
                androidx.constraintlayout.core.state.ConstraintSetParser$MotionLayoutDebugFlags[] r0 = $values()
                androidx.constraintlayout.core.state.ConstraintSetParser.MotionLayoutDebugFlags.$VALUES = r0
                return
        }

        private MotionLayoutDebugFlags(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.core.state.ConstraintSetParser.MotionLayoutDebugFlags valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.core.state.ConstraintSetParser$MotionLayoutDebugFlags> r0 = androidx.constraintlayout.core.state.ConstraintSetParser.MotionLayoutDebugFlags.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.core.state.ConstraintSetParser$MotionLayoutDebugFlags r1 = (androidx.constraintlayout.core.state.ConstraintSetParser.MotionLayoutDebugFlags) r1
                return r1
        }

        public static androidx.constraintlayout.core.state.ConstraintSetParser.MotionLayoutDebugFlags[] values() {
                androidx.constraintlayout.core.state.ConstraintSetParser$MotionLayoutDebugFlags[] r0 = androidx.constraintlayout.core.state.ConstraintSetParser.MotionLayoutDebugFlags.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.core.state.ConstraintSetParser$MotionLayoutDebugFlags[] r0 = (androidx.constraintlayout.core.state.ConstraintSetParser.MotionLayoutDebugFlags[]) r0
                return r0
        }
    }

    public static class OverrideValue implements androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue {
        float mValue;

        public OverrideValue(float r1) {
                r0 = this;
                r0.<init>()
                r0.mValue = r1
                return
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
                r1 = this;
                float r0 = r1.mValue
                return r0
        }
    }

    public ConstraintSetParser() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void applyAttribute(androidx.constraintlayout.core.state.State r8, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r9, androidx.constraintlayout.core.state.ConstraintReference r10, androidx.constraintlayout.core.parser.CLObject r11, java.lang.String r12) throws androidx.constraintlayout.core.parser.CLParsingException {
            r0 = 8
            r1 = 4
            r2 = 2
            r3 = 1
            r4 = 0
            r12.getClass()
            java.lang.String r5 = "parent"
            r6 = -1
            int r7 = r12.hashCode()
            switch(r7) {
                case -1448775240: goto L150;
                case -1364013995: goto L144;
                case -1349088399: goto L138;
                case -1249320806: goto L12b;
                case -1249320805: goto L11e;
                case -1249320804: goto L111;
                case -1225497657: goto L104;
                case -1225497656: goto Lf7;
                case -1225497655: goto Le9;
                case -1221029593: goto Ldb;
                case -1068318794: goto Lcc;
                case -987906986: goto Lbd;
                case -987906985: goto Lae;
                case -908189618: goto L9f;
                case -908189617: goto L90;
                case -247669061: goto L83;
                case -61505906: goto L75;
                case 92909918: goto L68;
                case 98116417: goto L5b;
                case 111045711: goto L4d;
                case 113126854: goto L3f;
                case 398344448: goto L32;
                case 1404070310: goto L25;
                case 1941332754: goto L17;
                default: goto L14;
            }
        L14:
            r7 = r6
            goto L15b
        L17:
            java.lang.String r7 = "visibility"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L21
            goto L14
        L21:
            r7 = 23
            goto L15b
        L25:
            java.lang.String r7 = "centerHorizontally"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L2e
            goto L14
        L2e:
            r7 = 22
            goto L15b
        L32:
            java.lang.String r7 = "hWeight"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L3b
            goto L14
        L3b:
            r7 = 21
            goto L15b
        L3f:
            java.lang.String r7 = "width"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L49
            goto L14
        L49:
            r7 = 20
            goto L15b
        L4d:
            java.lang.String r7 = "vBias"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L57
            goto L14
        L57:
            r7 = 19
            goto L15b
        L5b:
            java.lang.String r7 = "hBias"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L64
            goto L14
        L64:
            r7 = 18
            goto L15b
        L68:
            java.lang.String r7 = "alpha"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L71
            goto L14
        L71:
            r7 = 17
            goto L15b
        L75:
            java.lang.String r7 = "vWeight"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L7f
            goto L14
        L7f:
            r7 = 16
            goto L15b
        L83:
            java.lang.String r7 = "hRtlBias"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L8c
            goto L14
        L8c:
            r7 = 15
            goto L15b
        L90:
            java.lang.String r7 = "scaleY"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L9b
            goto L14
        L9b:
            r7 = 14
            goto L15b
        L9f:
            java.lang.String r7 = "scaleX"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto Laa
            goto L14
        Laa:
            r7 = 13
            goto L15b
        Lae:
            java.lang.String r7 = "pivotY"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto Lb9
            goto L14
        Lb9:
            r7 = 12
            goto L15b
        Lbd:
            java.lang.String r7 = "pivotX"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto Lc8
            goto L14
        Lc8:
            r7 = 11
            goto L15b
        Lcc:
            java.lang.String r7 = "motion"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto Ld7
            goto L14
        Ld7:
            r7 = 10
            goto L15b
        Ldb:
            java.lang.String r7 = "height"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto Le5
            goto L14
        Le5:
            r7 = 9
            goto L15b
        Le9:
            java.lang.String r7 = "translationZ"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto Lf4
            goto L14
        Lf4:
            r7 = r0
            goto L15b
        Lf7:
            java.lang.String r7 = "translationY"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L102
            goto L14
        L102:
            r7 = 7
            goto L15b
        L104:
            java.lang.String r7 = "translationX"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L10f
            goto L14
        L10f:
            r7 = 6
            goto L15b
        L111:
            java.lang.String r7 = "rotationZ"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L11c
            goto L14
        L11c:
            r7 = 5
            goto L15b
        L11e:
            java.lang.String r7 = "rotationY"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L129
            goto L14
        L129:
            r7 = r1
            goto L15b
        L12b:
            java.lang.String r7 = "rotationX"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L136
            goto L14
        L136:
            r7 = 3
            goto L15b
        L138:
            java.lang.String r7 = "custom"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L142
            goto L14
        L142:
            r7 = r2
            goto L15b
        L144:
            java.lang.String r7 = "center"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L14e
            goto L14
        L14e:
            r7 = r3
            goto L15b
        L150:
            java.lang.String r7 = "centerVertically"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L15a
            goto L14
        L15a:
            r7 = r4
        L15b:
            switch(r7) {
                case 0: goto L2d8;
                case 1: goto L2b6;
                case 2: goto L2b2;
                case 3: goto L2a6;
                case 4: goto L29a;
                case 5: goto L28e;
                case 6: goto L27e;
                case 7: goto L26e;
                case 8: goto L25e;
                case 9: goto L252;
                case 10: goto L24a;
                case 11: goto L23e;
                case 12: goto L232;
                case 13: goto L226;
                case 14: goto L21a;
                case 15: goto L204;
                case 16: goto L1f8;
                case 17: goto L1ec;
                case 18: goto L1e0;
                case 19: goto L1d4;
                case 20: goto L1c8;
                case 21: goto L1bc;
                case 22: goto L1a5;
                case 23: goto L162;
                default: goto L15e;
            }
        L15e:
            parseConstraint(r8, r9, r11, r10, r12)
            return
        L162:
            java.lang.String r8 = r11.getString(r12)
            r8.getClass()
            int r9 = r8.hashCode()
            switch(r9) {
                case -1901805651: goto L187;
                case 3178655: goto L17c;
                case 466743410: goto L172;
                default: goto L170;
            }
        L170:
            r2 = r6
            goto L191
        L172:
            java.lang.String r9 = "visible"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L191
            goto L170
        L17c:
            java.lang.String r9 = "gone"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L185
            goto L170
        L185:
            r2 = r3
            goto L191
        L187:
            java.lang.String r9 = "invisible"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L190
            goto L170
        L190:
            r2 = r4
        L191:
            switch(r2) {
                case 0: goto L19d;
                case 1: goto L199;
                case 2: goto L195;
                default: goto L194;
            }
        L194:
            return
        L195:
            r10.visibility(r4)
            return
        L199:
            r10.visibility(r0)
            return
        L19d:
            r10.visibility(r1)
            r8 = 0
            r10.alpha(r8)
            return
        L1a5:
            java.lang.String r9 = r11.getString(r12)
            boolean r11 = r9.equals(r5)
            if (r11 == 0) goto L1b1
            java.lang.Integer r9 = androidx.constraintlayout.core.state.State.PARENT
        L1b1:
            androidx.constraintlayout.core.state.ConstraintReference r8 = r8.constraints(r9)
            r10.startToStart(r8)
            r10.endToEnd(r8)
            return
        L1bc:
            androidx.constraintlayout.core.parser.CLElement r8 = r11.get(r12)
            float r8 = r9.get(r8)
            r10.setHorizontalChainWeight(r8)
            return
        L1c8:
            androidx.constraintlayout.core.state.CorePixelDp r9 = r8.getDpToPixel()
            androidx.constraintlayout.core.state.Dimension r8 = parseDimension(r11, r12, r8, r9)
            r10.setWidth(r8)
            return
        L1d4:
            androidx.constraintlayout.core.parser.CLElement r8 = r11.get(r12)
            float r8 = r9.get(r8)
            r10.verticalBias(r8)
            return
        L1e0:
            androidx.constraintlayout.core.parser.CLElement r8 = r11.get(r12)
            float r8 = r9.get(r8)
            r10.horizontalBias(r8)
            return
        L1ec:
            androidx.constraintlayout.core.parser.CLElement r8 = r11.get(r12)
            float r8 = r9.get(r8)
            r10.alpha(r8)
            return
        L1f8:
            androidx.constraintlayout.core.parser.CLElement r8 = r11.get(r12)
            float r8 = r9.get(r8)
            r10.setVerticalChainWeight(r8)
            return
        L204:
            androidx.constraintlayout.core.parser.CLElement r11 = r11.get(r12)
            float r9 = r9.get(r11)
            boolean r8 = r8.isRtl()
            if (r8 == 0) goto L216
            r8 = 1065353216(0x3f800000, float:1.0)
            float r9 = r8 - r9
        L216:
            r10.horizontalBias(r9)
            return
        L21a:
            androidx.constraintlayout.core.parser.CLElement r8 = r11.get(r12)
            float r8 = r9.get(r8)
            r10.scaleY(r8)
            return
        L226:
            androidx.constraintlayout.core.parser.CLElement r8 = r11.get(r12)
            float r8 = r9.get(r8)
            r10.scaleX(r8)
            return
        L232:
            androidx.constraintlayout.core.parser.CLElement r8 = r11.get(r12)
            float r8 = r9.get(r8)
            r10.pivotY(r8)
            return
        L23e:
            androidx.constraintlayout.core.parser.CLElement r8 = r11.get(r12)
            float r8 = r9.get(r8)
            r10.pivotX(r8)
            return
        L24a:
            androidx.constraintlayout.core.parser.CLElement r8 = r11.get(r12)
            parseMotionProperties(r8, r10)
            return
        L252:
            androidx.constraintlayout.core.state.CorePixelDp r9 = r8.getDpToPixel()
            androidx.constraintlayout.core.state.Dimension r8 = parseDimension(r11, r12, r8, r9)
            r10.setHeight(r8)
            return
        L25e:
            androidx.constraintlayout.core.parser.CLElement r11 = r11.get(r12)
            float r9 = r9.get(r11)
            float r8 = toPix(r8, r9)
            r10.translationZ(r8)
            return
        L26e:
            androidx.constraintlayout.core.parser.CLElement r11 = r11.get(r12)
            float r9 = r9.get(r11)
            float r8 = toPix(r8, r9)
            r10.translationY(r8)
            return
        L27e:
            androidx.constraintlayout.core.parser.CLElement r11 = r11.get(r12)
            float r9 = r9.get(r11)
            float r8 = toPix(r8, r9)
            r10.translationX(r8)
            return
        L28e:
            androidx.constraintlayout.core.parser.CLElement r8 = r11.get(r12)
            float r8 = r9.get(r8)
            r10.rotationZ(r8)
            return
        L29a:
            androidx.constraintlayout.core.parser.CLElement r8 = r11.get(r12)
            float r8 = r9.get(r8)
            r10.rotationY(r8)
            return
        L2a6:
            androidx.constraintlayout.core.parser.CLElement r8 = r11.get(r12)
            float r8 = r9.get(r8)
            r10.rotationX(r8)
            return
        L2b2:
            parseCustomProperties(r11, r10, r12)
            return
        L2b6:
            java.lang.String r9 = r11.getString(r12)
            boolean r11 = r9.equals(r5)
            if (r11 == 0) goto L2c7
            java.lang.Integer r9 = androidx.constraintlayout.core.state.State.PARENT
            androidx.constraintlayout.core.state.ConstraintReference r8 = r8.constraints(r9)
            goto L2cb
        L2c7:
            androidx.constraintlayout.core.state.ConstraintReference r8 = r8.constraints(r9)
        L2cb:
            r10.startToStart(r8)
            r10.endToEnd(r8)
            r10.topToTop(r8)
            r10.bottomToBottom(r8)
            return
        L2d8:
            java.lang.String r9 = r11.getString(r12)
            boolean r11 = r9.equals(r5)
            if (r11 == 0) goto L2e4
            java.lang.Integer r9 = androidx.constraintlayout.core.state.State.PARENT
        L2e4:
            androidx.constraintlayout.core.state.ConstraintReference r8 = r8.constraints(r9)
            r10.topToTop(r8)
            r10.bottomToBottom(r8)
            return
    }

    private static int indexOf(java.lang.String r2, java.lang.String... r3) {
            r0 = 0
        L1:
            int r1 = r3.length
            if (r0 >= r1) goto L10
            r1 = r3[r0]
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Ld
            return r0
        Ld:
            int r0 = r0 + 1
            goto L1
        L10:
            r2 = -1
            return r2
    }

    public static java.lang.String lookForType(androidx.constraintlayout.core.parser.CLObject r3) throws androidx.constraintlayout.core.parser.CLParsingException {
            java.util.ArrayList r0 = r3.names()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "type"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L8
            java.lang.String r3 = r3.getString(r2)
            return r3
        L22:
            r3 = 0
            return r3
    }

    public static void override(androidx.constraintlayout.core.parser.CLObject r7, java.lang.String r8, androidx.constraintlayout.core.parser.CLObject r9) throws androidx.constraintlayout.core.parser.CLParsingException {
            r0 = 1
            r1 = 0
            boolean r2 = r7.has(r8)
            if (r2 != 0) goto Lc
            r7.put(r8, r9)
            return
        Lc:
            androidx.constraintlayout.core.parser.CLObject r7 = r7.getObject(r8)
            java.util.ArrayList r8 = r9.names()
            java.util.Iterator r8 = r8.iterator()
        L18:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lf3
            java.lang.Object r2 = r8.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "clear"
            boolean r4 = r2.equals(r3)
            if (r4 != 0) goto L34
            androidx.constraintlayout.core.parser.CLElement r3 = r9.get(r2)
            r7.put(r2, r3)
            goto L18
        L34:
            androidx.constraintlayout.core.parser.CLArray r2 = r9.getArray(r3)
            r3 = r1
        L39:
            int r4 = r2.size()
            if (r3 >= r4) goto L18
            java.lang.String r4 = r2.getStringOrNull(r3)
            if (r4 != 0) goto L47
            goto Lf0
        L47:
            r5 = -1
            int r6 = r4.hashCode()
            switch(r6) {
                case -1727069561: goto L66;
                case -1606703562: goto L5b;
                case 414334925: goto L50;
                default: goto L4f;
            }
        L4f:
            goto L71
        L50:
            java.lang.String r6 = "dimensions"
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L59
            goto L71
        L59:
            r5 = 2
            goto L71
        L5b:
            java.lang.String r6 = "constraints"
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L64
            goto L71
        L64:
            r5 = r0
            goto L71
        L66:
            java.lang.String r6 = "transforms"
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L70
            goto L71
        L70:
            r5 = r1
        L71:
            switch(r5) {
                case 0: goto Laf;
                case 1: goto L84;
                case 2: goto L78;
                default: goto L74;
            }
        L74:
            r7.remove(r4)
            goto Lf0
        L78:
            java.lang.String r4 = "width"
            r7.remove(r4)
            java.lang.String r4 = "height"
            r7.remove(r4)
            goto Lf0
        L84:
            java.lang.String r4 = "start"
            r7.remove(r4)
            java.lang.String r4 = "end"
            r7.remove(r4)
            java.lang.String r4 = "top"
            r7.remove(r4)
            java.lang.String r4 = "bottom"
            r7.remove(r4)
            java.lang.String r4 = "baseline"
            r7.remove(r4)
            java.lang.String r4 = "center"
            r7.remove(r4)
            java.lang.String r4 = "centerHorizontally"
            r7.remove(r4)
            java.lang.String r4 = "centerVertically"
            r7.remove(r4)
            goto Lf0
        Laf:
            java.lang.String r4 = "visibility"
            r7.remove(r4)
            java.lang.String r4 = "alpha"
            r7.remove(r4)
            java.lang.String r4 = "pivotX"
            r7.remove(r4)
            java.lang.String r4 = "pivotY"
            r7.remove(r4)
            java.lang.String r4 = "rotationX"
            r7.remove(r4)
            java.lang.String r4 = "rotationY"
            r7.remove(r4)
            java.lang.String r4 = "rotationZ"
            r7.remove(r4)
            java.lang.String r4 = "scaleX"
            r7.remove(r4)
            java.lang.String r4 = "scaleY"
            r7.remove(r4)
            java.lang.String r4 = "translationX"
            r7.remove(r4)
            java.lang.String r4 = "translationY"
            r7.remove(r4)
        Lf0:
            int r3 = r3 + r0
            goto L39
        Lf3:
            return
    }

    public static void parseBarrier(androidx.constraintlayout.core.state.State r9, java.lang.String r10, androidx.constraintlayout.core.parser.CLObject r11) throws androidx.constraintlayout.core.parser.CLParsingException {
            r0 = 2
            r1 = -1
            r2 = 1
            r3 = 0
            boolean r4 = r9.isRtl()
            androidx.constraintlayout.core.state.State$Direction r5 = androidx.constraintlayout.core.state.State.Direction.END
            androidx.constraintlayout.core.state.helpers.BarrierReference r10 = r9.barrier(r10, r5)
            java.util.ArrayList r5 = r11.names()
            if (r5 != 0) goto L16
            goto L126
        L16:
            java.util.Iterator r5 = r5.iterator()
        L1a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L126
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            int r7 = r6.hashCode()
            switch(r7) {
                case -1081309778: goto L48;
                case -962590849: goto L3d;
                case -567445985: goto L32;
                default: goto L30;
            }
        L30:
            r7 = r1
            goto L53
        L32:
            java.lang.String r7 = "contains"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L3b
            goto L30
        L3b:
            r7 = r0
            goto L53
        L3d:
            java.lang.String r7 = "direction"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L46
            goto L30
        L46:
            r7 = r2
            goto L53
        L48:
            java.lang.String r7 = "margin"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L52
            goto L30
        L52:
            r7 = r3
        L53:
            switch(r7) {
                case 0: goto L10f;
                case 1: goto L79;
                case 2: goto L57;
                default: goto L56;
            }
        L56:
            goto L1a
        L57:
            androidx.constraintlayout.core.parser.CLArray r6 = r11.getArrayOrNull(r6)
            if (r6 == 0) goto L1a
            r7 = r3
        L5e:
            int r8 = r6.size()
            if (r7 >= r8) goto L1a
            androidx.constraintlayout.core.parser.CLElement r8 = r6.get(r7)
            java.lang.String r8 = r8.content()
            androidx.constraintlayout.core.state.ConstraintReference r8 = r9.constraints(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            r10.add(r8)
            int r7 = r7 + r2
            goto L5e
        L79:
            java.lang.String r6 = r11.getString(r6)
            r6.getClass()
            int r7 = r6.hashCode()
            switch(r7) {
                case -1383228885: goto Lc4;
                case 100571: goto Lb9;
                case 115029: goto Lad;
                case 3317767: goto La1;
                case 108511772: goto L95;
                case 109757538: goto L89;
                default: goto L87;
            }
        L87:
            r6 = r1
            goto Lce
        L89:
            java.lang.String r7 = "start"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L93
            goto L87
        L93:
            r6 = 5
            goto Lce
        L95:
            java.lang.String r7 = "right"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L9f
            goto L87
        L9f:
            r6 = 4
            goto Lce
        La1:
            java.lang.String r7 = "left"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto Lab
            goto L87
        Lab:
            r6 = 3
            goto Lce
        Lad:
            java.lang.String r7 = "top"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto Lb7
            goto L87
        Lb7:
            r6 = r0
            goto Lce
        Lb9:
            java.lang.String r7 = "end"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto Lc2
            goto L87
        Lc2:
            r6 = r2
            goto Lce
        Lc4:
            java.lang.String r7 = "bottom"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto Lcd
            goto L87
        Lcd:
            r6 = r3
        Lce:
            switch(r6) {
                case 0: goto L108;
                case 1: goto Lf8;
                case 2: goto Lf1;
                case 3: goto Lea;
                case 4: goto Le3;
                case 5: goto Ld3;
                default: goto Ld1;
            }
        Ld1:
            goto L1a
        Ld3:
            if (r4 != 0) goto Ldc
            androidx.constraintlayout.core.state.State$Direction r6 = androidx.constraintlayout.core.state.State.Direction.LEFT
            r10.setBarrierDirection(r6)
            goto L1a
        Ldc:
            androidx.constraintlayout.core.state.State$Direction r6 = androidx.constraintlayout.core.state.State.Direction.RIGHT
            r10.setBarrierDirection(r6)
            goto L1a
        Le3:
            androidx.constraintlayout.core.state.State$Direction r6 = androidx.constraintlayout.core.state.State.Direction.RIGHT
            r10.setBarrierDirection(r6)
            goto L1a
        Lea:
            androidx.constraintlayout.core.state.State$Direction r6 = androidx.constraintlayout.core.state.State.Direction.LEFT
            r10.setBarrierDirection(r6)
            goto L1a
        Lf1:
            androidx.constraintlayout.core.state.State$Direction r6 = androidx.constraintlayout.core.state.State.Direction.TOP
            r10.setBarrierDirection(r6)
            goto L1a
        Lf8:
            if (r4 != 0) goto L101
            androidx.constraintlayout.core.state.State$Direction r6 = androidx.constraintlayout.core.state.State.Direction.RIGHT
            r10.setBarrierDirection(r6)
            goto L1a
        L101:
            androidx.constraintlayout.core.state.State$Direction r6 = androidx.constraintlayout.core.state.State.Direction.LEFT
            r10.setBarrierDirection(r6)
            goto L1a
        L108:
            androidx.constraintlayout.core.state.State$Direction r6 = androidx.constraintlayout.core.state.State.Direction.BOTTOM
            r10.setBarrierDirection(r6)
            goto L1a
        L10f:
            float r6 = r11.getFloatOrNaN(r6)
            boolean r7 = java.lang.Float.isNaN(r6)
            if (r7 != 0) goto L1a
            float r6 = toPix(r9, r6)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r10.margin(r6)
            goto L1a
        L126:
            return
    }

    public static void parseChain(int r6, androidx.constraintlayout.core.state.State r7, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r8, androidx.constraintlayout.core.parser.CLArray r9) throws androidx.constraintlayout.core.parser.CLParsingException {
            r0 = 1
            if (r6 != 0) goto L8
            androidx.constraintlayout.core.state.helpers.HorizontalChainReference r6 = r7.horizontalChain()
            goto Lc
        L8:
            androidx.constraintlayout.core.state.helpers.VerticalChainReference r6 = r7.verticalChain()
        Lc:
            androidx.constraintlayout.core.parser.CLElement r1 = r9.get(r0)
            boolean r2 = r1 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r2 == 0) goto Lb1
            androidx.constraintlayout.core.parser.CLArray r1 = (androidx.constraintlayout.core.parser.CLArray) r1
            int r2 = r1.size()
            if (r2 >= r0) goto L1e
            goto Lb1
        L1e:
            r2 = 0
            r3 = r2
        L20:
            int r4 = r1.size()
            if (r3 >= r4) goto L33
            java.lang.String r4 = r1.getString(r3)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r6.add(r4)
            int r3 = r3 + r0
            goto L20
        L33:
            int r1 = r9.size()
            r3 = 2
            if (r1 <= r3) goto Lb1
            androidx.constraintlayout.core.parser.CLElement r9 = r9.get(r3)
            boolean r1 = r9 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r1 != 0) goto L43
            goto Lb1
        L43:
            androidx.constraintlayout.core.parser.CLObject r9 = (androidx.constraintlayout.core.parser.CLObject) r9
            java.util.ArrayList r1 = r9.names()
            java.util.Iterator r1 = r1.iterator()
        L4d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lb1
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            java.lang.String r4 = "style"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L69
            parseConstraint(r7, r8, r9, r6, r3)
            goto L4d
        L69:
            androidx.constraintlayout.core.parser.CLElement r3 = r9.get(r3)
            boolean r4 = r3 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r4 == 0) goto L86
            r4 = r3
            androidx.constraintlayout.core.parser.CLArray r4 = (androidx.constraintlayout.core.parser.CLArray) r4
            int r5 = r4.size()
            if (r5 <= r0) goto L86
            java.lang.String r3 = r4.getString(r2)
            float r4 = r4.getFloat(r0)
            r6.bias(r4)
            goto L8a
        L86:
            java.lang.String r3 = r3.content()
        L8a:
            r3.getClass()
            java.lang.String r4 = "packed"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto Lab
            java.lang.String r4 = "spread_inside"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto La5
            androidx.constraintlayout.core.state.State$Chain r3 = androidx.constraintlayout.core.state.State.Chain.SPREAD
            r6.style(r3)
            goto L4d
        La5:
            androidx.constraintlayout.core.state.State$Chain r3 = androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE
            r6.style(r3)
            goto L4d
        Lab:
            androidx.constraintlayout.core.state.State$Chain r3 = androidx.constraintlayout.core.state.State.Chain.PACKED
            r6.style(r3)
            goto L4d
        Lb1:
            return
    }

    private static void parseChainType(java.lang.String r18, androidx.constraintlayout.core.state.State r19, java.lang.String r20, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r21, androidx.constraintlayout.core.parser.CLObject r22) throws androidx.constraintlayout.core.parser.CLParsingException {
            r0 = r19
            r1 = r20
            r2 = r22
            r3 = 6
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = r18
            char r10 = r10.charAt(r9)
            r11 = 104(0x68, float:1.46E-43)
            if (r10 != r11) goto L1d
            androidx.constraintlayout.core.state.helpers.HorizontalChainReference r10 = r0.horizontalChain()
        L1b:
            r11 = r10
            goto L22
        L1d:
            androidx.constraintlayout.core.state.helpers.VerticalChainReference r10 = r0.verticalChain()
            goto L1b
        L22:
            r11.setKey(r1)
            java.util.ArrayList r10 = r2.names()
            java.util.Iterator r10 = r10.iterator()
        L2d:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L20c
            java.lang.Object r12 = r10.next()
            java.lang.String r12 = (java.lang.String) r12
            r12.getClass()
            r13 = -1
            int r14 = r12.hashCode()
            switch(r14) {
                case -1383228885: goto L99;
                case -567445985: goto L8e;
                case 100571: goto L83;
                case 115029: goto L77;
                case 3317767: goto L6b;
                case 108511772: goto L5f;
                case 109757538: goto L53;
                case 109780401: goto L46;
                default: goto L44;
            }
        L44:
            goto La3
        L46:
            java.lang.String r14 = "style"
            boolean r14 = r12.equals(r14)
            if (r14 != 0) goto L51
            goto La3
        L51:
            r13 = 7
            goto La3
        L53:
            java.lang.String r14 = "start"
            boolean r14 = r12.equals(r14)
            if (r14 != 0) goto L5d
            goto La3
        L5d:
            r13 = r3
            goto La3
        L5f:
            java.lang.String r14 = "right"
            boolean r14 = r12.equals(r14)
            if (r14 != 0) goto L69
            goto La3
        L69:
            r13 = r4
            goto La3
        L6b:
            java.lang.String r14 = "left"
            boolean r14 = r12.equals(r14)
            if (r14 != 0) goto L75
            goto La3
        L75:
            r13 = r5
            goto La3
        L77:
            java.lang.String r14 = "top"
            boolean r14 = r12.equals(r14)
            if (r14 != 0) goto L81
            goto La3
        L81:
            r13 = r6
            goto La3
        L83:
            java.lang.String r14 = "end"
            boolean r14 = r12.equals(r14)
            if (r14 != 0) goto L8c
            goto La3
        L8c:
            r13 = r7
            goto La3
        L8e:
            java.lang.String r14 = "contains"
            boolean r14 = r12.equals(r14)
            if (r14 != 0) goto L97
            goto La3
        L97:
            r13 = r8
            goto La3
        L99:
            java.lang.String r14 = "bottom"
            boolean r14 = r12.equals(r14)
            if (r14 != 0) goto La2
            goto La3
        La2:
            r13 = r9
        La3:
            switch(r13) {
                case 0: goto L201;
                case 1: goto Lf3;
                case 2: goto L201;
                case 3: goto L201;
                case 4: goto L201;
                case 5: goto L201;
                case 6: goto L201;
                case 7: goto Lab;
                default: goto La6;
            }
        La6:
            r3 = r21
            r9 = r6
            goto L207
        Lab:
            androidx.constraintlayout.core.parser.CLElement r12 = r2.get(r12)
            boolean r13 = r12 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r13 == 0) goto Lc8
            r13 = r12
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            int r14 = r13.size()
            if (r14 <= r8) goto Lc8
            java.lang.String r12 = r13.getString(r9)
            float r13 = r13.getFloat(r8)
            r11.bias(r13)
            goto Lcc
        Lc8:
            java.lang.String r12 = r12.content()
        Lcc:
            r12.getClass()
            java.lang.String r13 = "packed"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto Led
            java.lang.String r13 = "spread_inside"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto Le7
            androidx.constraintlayout.core.state.State$Chain r12 = androidx.constraintlayout.core.state.State.Chain.SPREAD
            r11.style(r12)
            goto La6
        Le7:
            androidx.constraintlayout.core.state.State$Chain r12 = androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE
            r11.style(r12)
            goto La6
        Led:
            androidx.constraintlayout.core.state.State$Chain r12 = androidx.constraintlayout.core.state.State.Chain.PACKED
            r11.style(r12)
            goto La6
        Lf3:
            androidx.constraintlayout.core.parser.CLElement r12 = r2.get(r12)
            boolean r13 = r12 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r13 == 0) goto L1de
            r13 = r12
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            int r14 = r13.size()
            if (r14 >= r8) goto L106
            goto L1de
        L106:
            r12 = r9
        L107:
            int r14 = r13.size()
            if (r12 >= r14) goto L1da
            androidx.constraintlayout.core.parser.CLElement r14 = r13.get(r12)
            boolean r15 = r14 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r15 == 0) goto L1c4
            androidx.constraintlayout.core.parser.CLArray r14 = (androidx.constraintlayout.core.parser.CLArray) r14
            int r15 = r14.size()
            if (r15 <= 0) goto L1c0
            androidx.constraintlayout.core.parser.CLElement r15 = r14.get(r9)
            java.lang.String r15 = r15.content()
            int r9 = r14.size()
            r16 = 2143289344(0x7fc00000, float:NaN)
            if (r9 == r7) goto L1ae
            if (r9 == r6) goto L197
            if (r9 == r5) goto L173
            if (r9 == r3) goto L13f
            r9 = r6
            r6 = r12
            r3 = r13
            r12 = r15
            r13 = r16
            r14 = r13
        L13a:
            r15 = r14
            r17 = r15
            goto L1bc
        L13f:
            float r16 = r14.getFloat(r8)
            float r9 = r14.getFloat(r7)
            float r9 = toPix(r0, r9)
            float r3 = r14.getFloat(r6)
            float r3 = toPix(r0, r3)
            float r6 = r14.getFloat(r5)
            float r6 = toPix(r0, r6)
            float r14 = r14.getFloat(r4)
            float r14 = toPix(r0, r14)
            r17 = r15
            r15 = r3
            r3 = r13
            r13 = r16
            r16 = r6
            r6 = r12
            r12 = r17
            r17 = r14
            r14 = r9
            r9 = 3
            goto L1bc
        L173:
            float r3 = r14.getFloat(r8)
            float r6 = r14.getFloat(r7)
            float r6 = toPix(r0, r6)
            r9 = 3
            float r14 = r14.getFloat(r9)
            float r14 = toPix(r0, r14)
            r17 = r13
            r13 = r3
            r3 = r17
            r17 = r14
            r14 = r6
            r6 = r12
            r12 = r15
            r15 = r17
            r17 = r16
            goto L1bc
        L197:
            r9 = r6
            float r3 = r14.getFloat(r8)
            float r6 = r14.getFloat(r7)
            float r6 = toPix(r0, r6)
            r14 = r13
            r13 = r3
            r3 = r14
            r14 = r6
            r17 = r16
            r6 = r12
            r12 = r15
            r15 = r14
            goto L1bc
        L1ae:
            r9 = r6
            float r3 = r14.getFloat(r8)
            r6 = r13
            r13 = r3
            r3 = r6
            r6 = r12
            r12 = r15
            r14 = r16
            goto L13a
        L1bc:
            r11.addChainElement(r12, r13, r14, r15, r16, r17)
            goto L1d2
        L1c0:
            r9 = r6
            r6 = r12
            r3 = r13
            goto L1d2
        L1c4:
            r9 = r6
            r6 = r12
            r3 = r13
            java.lang.String r12 = r14.content()
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            r11.add(r12)
        L1d2:
            int r12 = r6 + 1
            r13 = r3
            r6 = r9
            r3 = 6
            r9 = 0
            goto L107
        L1da:
            r9 = r6
            r3 = r21
            goto L207
        L1de:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " contains should be an array \""
            r2.append(r1)
            java.lang.String r1 = r12.content()
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.println(r1)
            return
        L201:
            r3 = r21
            r9 = r6
            parseConstraint(r0, r3, r2, r11, r12)
        L207:
            r6 = r9
            r3 = 6
            r9 = 0
            goto L2d
        L20c:
            return
    }

    public static long parseColorString(java.lang.String r2) {
            java.lang.String r0 = "#"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L2c
            r0 = 1
            java.lang.String r2 = r2.substring(r0)
            int r0 = r2.length()
            r1 = 6
            if (r0 != r1) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FF"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
        L25:
            r0 = 16
            long r0 = java.lang.Long.parseLong(r2, r0)
            return r0
        L2c:
            r0 = -1
            return r0
    }

    public static void parseConstraint(androidx.constraintlayout.core.state.State r21, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r22, androidx.constraintlayout.core.parser.CLObject r23, androidx.constraintlayout.core.state.ConstraintReference r24, java.lang.String r25) throws androidx.constraintlayout.core.parser.CLParsingException {
            r0 = r21
            r1 = r22
            r2 = r23
            r4 = r25
            java.lang.String r5 = "right"
            java.lang.String r6 = "left"
            java.lang.String r8 = "start"
            java.lang.String r9 = "end"
            java.lang.String r11 = "top"
            java.lang.String r12 = "bottom"
            java.lang.String r13 = "baseline"
            r7 = 0
            r14 = 1
            boolean r16 = r0.isRtl()
            r17 = r16 ^ 1
            androidx.constraintlayout.core.parser.CLArray r10 = r2.getArrayOrNull(r4)
            java.lang.String r15 = "parent"
            if (r10 == 0) goto L25a
            int r2 = r10.size()
            if (r2 <= r14) goto L25a
            java.lang.String r2 = r10.getString(r7)
            java.lang.String r7 = r10.getStringOrNull(r14)
            int r14 = r10.size()
            r20 = 0
            r3 = 2
            if (r14 <= r3) goto L4f
            androidx.constraintlayout.core.parser.CLElement r14 = r10.getOrNull(r3)
            float r3 = r1.get(r14)
            float r3 = toPix(r0, r3)
            goto L51
        L4f:
            r3 = r20
        L51:
            int r14 = r10.size()
            r23 = r3
            r3 = 3
            if (r14 <= r3) goto L67
            androidx.constraintlayout.core.parser.CLElement r14 = r10.getOrNull(r3)
            float r14 = r1.get(r14)
            float r14 = toPix(r0, r14)
            goto L69
        L67:
            r14 = r20
        L69:
            boolean r15 = r2.equals(r15)
            if (r15 == 0) goto L76
            java.lang.Integer r2 = androidx.constraintlayout.core.state.State.PARENT
            androidx.constraintlayout.core.state.ConstraintReference r2 = r0.constraints(r2)
            goto L7a
        L76:
            androidx.constraintlayout.core.state.ConstraintReference r2 = r0.constraints(r2)
        L7a:
            r4.getClass()
            int r15 = r4.hashCode()
            switch(r15) {
                case -1720785339: goto Lc7;
                case -1498085729: goto Lbc;
                case -1383228885: goto Lb3;
                case 100571: goto Laa;
                case 115029: goto La1;
                case 3317767: goto L98;
                case 108511772: goto L8f;
                case 109757538: goto L86;
                default: goto L84;
            }
        L84:
            r4 = -1
            goto Lcf
        L86:
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L8d
            goto L84
        L8d:
            r4 = 7
            goto Lcf
        L8f:
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L96
            goto L84
        L96:
            r4 = 6
            goto Lcf
        L98:
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L9f
            goto L84
        L9f:
            r4 = 5
            goto Lcf
        La1:
            boolean r4 = r4.equals(r11)
            if (r4 != 0) goto La8
            goto L84
        La8:
            r4 = 4
            goto Lcf
        Laa:
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto Lb1
            goto L84
        Lb1:
            r4 = r3
            goto Lcf
        Lb3:
            boolean r4 = r4.equals(r12)
            if (r4 != 0) goto Lba
            goto L84
        Lba:
            r4 = 2
            goto Lcf
        Lbc:
            java.lang.String r15 = "circular"
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto Lc5
            goto L84
        Lc5:
            r4 = 1
            goto Lcf
        Lc7:
            boolean r4 = r4.equals(r13)
            if (r4 != 0) goto Lce
            goto L84
        Lce:
            r4 = 0
        Lcf:
            switch(r4) {
                case 0: goto L19d;
                case 1: goto L177;
                case 2: goto L134;
                case 3: goto L12f;
                case 4: goto Lec;
                case 5: goto Le8;
                case 6: goto Le4;
                case 7: goto Ld9;
                default: goto Ld2;
            }
        Ld2:
            r4 = r24
        Ld4:
            r15 = 1
            r18 = 2
            goto L1f4
        Ld9:
            r4 = r24
            r0 = r17
        Ldd:
            r15 = 1
            r18 = 2
            r19 = 1
            goto L1f7
        Le4:
            r4 = r24
            r0 = 0
            goto Ldd
        Le8:
            r4 = r24
            r0 = 1
            goto Ldd
        Lec:
            r7.getClass()
            int r1 = r7.hashCode()
            switch(r1) {
                case -1720785339: goto L10a;
                case -1383228885: goto L101;
                case 115029: goto Lf8;
                default: goto Lf6;
            }
        Lf6:
            r1 = -1
            goto L112
        Lf8:
            boolean r1 = r7.equals(r11)
            if (r1 != 0) goto Lff
            goto Lf6
        Lff:
            r1 = 2
            goto L112
        L101:
            boolean r1 = r7.equals(r12)
            if (r1 != 0) goto L108
            goto Lf6
        L108:
            r1 = 1
            goto L112
        L10a:
            boolean r1 = r7.equals(r13)
            if (r1 != 0) goto L111
            goto Lf6
        L111:
            r1 = 0
        L112:
            switch(r1) {
                case 0: goto L122;
                case 1: goto L11c;
                case 2: goto L116;
                default: goto L115;
            }
        L115:
            goto Ld2
        L116:
            r4 = r24
            r4.topToTop(r2)
            goto Ld4
        L11c:
            r4 = r24
            r4.topToBottom(r2)
            goto Ld4
        L122:
            r4 = r24
            java.lang.Object r1 = r2.getKey()
            r0.baselineNeededFor(r1)
            r4.topToBaseline(r2)
            goto Ld4
        L12f:
            r4 = r24
            r0 = r16
            goto Ldd
        L134:
            r4 = r24
            r7.getClass()
            int r1 = r7.hashCode()
            switch(r1) {
                case -1720785339: goto L154;
                case -1383228885: goto L14b;
                case 115029: goto L142;
                default: goto L140;
            }
        L140:
            r1 = -1
            goto L15c
        L142:
            boolean r1 = r7.equals(r11)
            if (r1 != 0) goto L149
            goto L140
        L149:
            r1 = 2
            goto L15c
        L14b:
            boolean r1 = r7.equals(r12)
            if (r1 != 0) goto L152
            goto L140
        L152:
            r1 = 1
            goto L15c
        L154:
            boolean r1 = r7.equals(r13)
            if (r1 != 0) goto L15b
            goto L140
        L15b:
            r1 = 0
        L15c:
            switch(r1) {
                case 0: goto L16b;
                case 1: goto L166;
                case 2: goto L161;
                default: goto L15f;
            }
        L15f:
            goto Ld4
        L161:
            r4.bottomToTop(r2)
            goto Ld4
        L166:
            r4.bottomToBottom(r2)
            goto Ld4
        L16b:
            java.lang.Object r1 = r2.getKey()
            r0.baselineNeededFor(r1)
            r4.bottomToBaseline(r2)
            goto Ld4
        L177:
            r4 = r24
            r15 = 1
            androidx.constraintlayout.core.parser.CLElement r11 = r10.get(r15)
            float r11 = r1.get(r11)
            int r12 = r10.size()
            r13 = 2
            if (r12 <= r13) goto L195
            androidx.constraintlayout.core.parser.CLElement r10 = r10.getOrNull(r13)
            float r1 = r1.get(r10)
            float r20 = toPix(r0, r1)
        L195:
            r0 = r20
            r4.circularConstraint(r2, r11, r0)
            r18 = r13
            goto L1f4
        L19d:
            r4 = r24
            r15 = 1
            r18 = 2
            r7.getClass()
            int r1 = r7.hashCode()
            switch(r1) {
                case -1720785339: goto L1c1;
                case -1383228885: goto L1b8;
                case 115029: goto L1ae;
                default: goto L1ac;
            }
        L1ac:
            r1 = -1
            goto L1c9
        L1ae:
            boolean r1 = r7.equals(r11)
            if (r1 != 0) goto L1b5
            goto L1ac
        L1b5:
            r1 = r18
            goto L1c9
        L1b8:
            boolean r1 = r7.equals(r12)
            if (r1 != 0) goto L1bf
            goto L1ac
        L1bf:
            r1 = r15
            goto L1c9
        L1c1:
            boolean r1 = r7.equals(r13)
            if (r1 != 0) goto L1c8
            goto L1ac
        L1c8:
            r1 = 0
        L1c9:
            switch(r1) {
                case 0: goto L1e3;
                case 1: goto L1d8;
                case 2: goto L1cd;
                default: goto L1cc;
            }
        L1cc:
            goto L1f4
        L1cd:
            java.lang.Object r1 = r4.getKey()
            r0.baselineNeededFor(r1)
            r4.baselineToTop(r2)
            goto L1f4
        L1d8:
            java.lang.Object r1 = r4.getKey()
            r0.baselineNeededFor(r1)
            r4.baselineToBottom(r2)
            goto L1f4
        L1e3:
            java.lang.Object r1 = r4.getKey()
            r0.baselineNeededFor(r1)
            java.lang.Object r1 = r2.getKey()
            r0.baselineNeededFor(r1)
            r4.baselineToBaseline(r2)
        L1f4:
            r0 = r15
            r19 = 0
        L1f7:
            if (r19 == 0) goto L24a
            r7.getClass()
            int r1 = r7.hashCode()
            switch(r1) {
                case 100571: goto L221;
                case 3317767: goto L218;
                case 108511772: goto L20e;
                case 109757538: goto L205;
                default: goto L203;
            }
        L203:
            r10 = -1
            goto L229
        L205:
            boolean r1 = r7.equals(r8)
            if (r1 != 0) goto L20c
            goto L203
        L20c:
            r10 = r3
            goto L229
        L20e:
            boolean r1 = r7.equals(r5)
            if (r1 != 0) goto L215
            goto L203
        L215:
            r10 = r18
            goto L229
        L218:
            boolean r1 = r7.equals(r6)
            if (r1 != 0) goto L21f
            goto L203
        L21f:
            r10 = r15
            goto L229
        L221:
            boolean r1 = r7.equals(r9)
            if (r1 != 0) goto L228
            goto L203
        L228:
            r10 = 0
        L229:
            switch(r10) {
                case 0: goto L233;
                case 1: goto L22c;
                case 2: goto L231;
                case 3: goto L22e;
                default: goto L22c;
            }
        L22c:
            r7 = r15
            goto L235
        L22e:
            r7 = r17
            goto L235
        L231:
            r7 = 0
            goto L235
        L233:
            r7 = r16
        L235:
            if (r0 == 0) goto L241
            if (r7 == 0) goto L23d
            r4.leftToLeft(r2)
            goto L24a
        L23d:
            r4.leftToRight(r2)
            goto L24a
        L241:
            if (r7 == 0) goto L247
            r4.rightToLeft(r2)
            goto L24a
        L247:
            r4.rightToRight(r2)
        L24a:
            java.lang.Float r0 = java.lang.Float.valueOf(r23)
            androidx.constraintlayout.core.state.ConstraintReference r0 = r4.margin(r0)
            java.lang.Float r1 = java.lang.Float.valueOf(r14)
            r0.marginGone(r1)
            return
        L25a:
            r1 = r24
            r19 = r14
            r3 = 3
            r18 = 2
            r2 = r23
            java.lang.String r2 = r2.getStringOrNull(r4)
            if (r2 == 0) goto L2e5
            boolean r5 = r2.equals(r15)
            if (r5 == 0) goto L276
            java.lang.Integer r2 = androidx.constraintlayout.core.state.State.PARENT
            androidx.constraintlayout.core.state.ConstraintReference r2 = r0.constraints(r2)
            goto L27a
        L276:
            androidx.constraintlayout.core.state.ConstraintReference r2 = r0.constraints(r2)
        L27a:
            r4.getClass()
            int r5 = r4.hashCode()
            switch(r5) {
                case -1720785339: goto L2ac;
                case -1383228885: goto L2a2;
                case 100571: goto L298;
                case 115029: goto L28f;
                case 109757538: goto L286;
                default: goto L284;
            }
        L284:
            r7 = -1
            goto L2b4
        L286:
            boolean r3 = r4.equals(r8)
            if (r3 != 0) goto L28d
            goto L284
        L28d:
            r7 = 4
            goto L2b4
        L28f:
            boolean r4 = r4.equals(r11)
            if (r4 != 0) goto L296
            goto L284
        L296:
            r7 = r3
            goto L2b4
        L298:
            boolean r3 = r4.equals(r9)
            if (r3 != 0) goto L29f
            goto L284
        L29f:
            r7 = r18
            goto L2b4
        L2a2:
            boolean r3 = r4.equals(r12)
            if (r3 != 0) goto L2a9
            goto L284
        L2a9:
            r7 = r19
            goto L2b4
        L2ac:
            boolean r3 = r4.equals(r13)
            if (r3 != 0) goto L2b3
            goto L284
        L2b3:
            r7 = 0
        L2b4:
            switch(r7) {
                case 0: goto L2d4;
                case 1: goto L2d0;
                case 2: goto L2c6;
                case 3: goto L2c2;
                case 4: goto L2b8;
                default: goto L2b7;
            }
        L2b7:
            goto L2e5
        L2b8:
            if (r16 != 0) goto L2be
            r1.leftToLeft(r2)
            return
        L2be:
            r1.rightToRight(r2)
            return
        L2c2:
            r1.topToTop(r2)
            return
        L2c6:
            if (r16 != 0) goto L2cc
            r1.rightToRight(r2)
            return
        L2cc:
            r1.leftToLeft(r2)
            return
        L2d0:
            r1.bottomToBottom(r2)
            return
        L2d4:
            java.lang.Object r3 = r1.getKey()
            r0.baselineNeededFor(r3)
            java.lang.Object r3 = r2.getKey()
            r0.baselineNeededFor(r3)
            r1.baselineToBaseline(r2)
        L2e5:
            return
    }

    public static void parseConstraintSets(androidx.constraintlayout.core.state.CoreMotionScene r8, androidx.constraintlayout.core.parser.CLObject r9) throws androidx.constraintlayout.core.parser.CLParsingException {
            java.util.ArrayList r0 = r9.names()
            if (r0 != 0) goto L7
            goto L69
        L7:
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            androidx.constraintlayout.core.parser.CLObject r2 = r9.getObject(r1)
            java.lang.String r3 = "Extends"
            java.lang.String r3 = r2.getStringOrNull(r3)
            if (r3 == 0) goto L61
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L61
            java.lang.String r3 = r8.getConstraintSet(r3)
            if (r3 != 0) goto L30
            goto Lb
        L30:
            androidx.constraintlayout.core.parser.CLObject r3 = androidx.constraintlayout.core.parser.CLParser.parse(r3)
            java.util.ArrayList r4 = r2.names()
            if (r4 != 0) goto L3b
            goto Lb
        L3b:
            java.util.Iterator r4 = r4.iterator()
        L3f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            androidx.constraintlayout.core.parser.CLElement r6 = r2.get(r5)
            boolean r7 = r6 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r7 == 0) goto L3f
            androidx.constraintlayout.core.parser.CLObject r6 = (androidx.constraintlayout.core.parser.CLObject) r6
            override(r3, r5, r6)
            goto L3f
        L59:
            java.lang.String r2 = r3.toJSON()
            r8.setConstraintSetContent(r1, r2)
            goto Lb
        L61:
            java.lang.String r2 = r2.toJSON()
            r8.setConstraintSetContent(r1, r2)
            goto Lb
        L69:
            return
    }

    public static void parseCustomProperties(androidx.constraintlayout.core.parser.CLObject r5, androidx.constraintlayout.core.state.ConstraintReference r6, java.lang.String r7) throws androidx.constraintlayout.core.parser.CLParsingException {
            androidx.constraintlayout.core.parser.CLObject r5 = r5.getObjectOrNull(r7)
            if (r5 != 0) goto L7
            goto L45
        L7:
            java.util.ArrayList r7 = r5.names()
            if (r7 != 0) goto Le
            goto L45
        Le:
            java.util.Iterator r7 = r7.iterator()
        L12:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            androidx.constraintlayout.core.parser.CLElement r1 = r5.get(r0)
            boolean r2 = r1 instanceof androidx.constraintlayout.core.parser.CLNumber
            if (r2 == 0) goto L2e
            float r1 = r1.getFloat()
            r6.addCustomFloat(r0, r1)
            goto L12
        L2e:
            boolean r2 = r1 instanceof androidx.constraintlayout.core.parser.CLString
            if (r2 == 0) goto L12
            java.lang.String r1 = r1.content()
            long r1 = parseColorString(r1)
            r3 = -1
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L12
            int r1 = (int) r1
            r6.addCustomColor(r0, r1)
            goto L12
        L45:
            return
    }

    public static void parseDesignElementsJSON(java.lang.String r11, java.util.ArrayList<androidx.constraintlayout.core.state.ConstraintSetParser.DesignElement> r12) throws androidx.constraintlayout.core.parser.CLParsingException {
            androidx.constraintlayout.core.parser.CLObject r11 = androidx.constraintlayout.core.parser.CLParser.parse(r11)
            java.util.ArrayList r0 = r11.names()
            if (r0 != 0) goto Lc
            goto L9f
        Lc:
            int r1 = r0.size()
            if (r1 <= 0) goto L9f
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            androidx.constraintlayout.core.parser.CLElement r11 = r11.get(r0)
            r0.getClass()
            java.lang.String r2 = "Design"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L2a
            goto L9f
        L2a:
            boolean r2 = r11 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r2 != 0) goto L2f
            goto L9f
        L2f:
            androidx.constraintlayout.core.parser.CLObject r11 = (androidx.constraintlayout.core.parser.CLObject) r11
            java.util.ArrayList r2 = r11.names()
            r3 = r1
        L36:
            int r4 = r2.size()
            if (r3 >= r4) goto L9f
            java.lang.Object r4 = r2.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            androidx.constraintlayout.core.parser.CLElement r5 = r11.get(r4)
            androidx.constraintlayout.core.parser.CLObject r5 = (androidx.constraintlayout.core.parser.CLObject) r5
            java.io.PrintStream r6 = java.lang.System.out
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "element found "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r4 = ""
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r6.printf(r4, r7)
            java.lang.String r4 = "type"
            java.lang.String r4 = r5.getStringOrNull(r4)
            if (r4 == 0) goto L9c
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            int r7 = r5.size()
            r8 = r1
        L78:
            if (r8 >= r7) goto L94
            androidx.constraintlayout.core.parser.CLElement r9 = r5.get(r3)
            androidx.constraintlayout.core.parser.CLKey r9 = (androidx.constraintlayout.core.parser.CLKey) r9
            java.lang.String r10 = r9.content()
            androidx.constraintlayout.core.parser.CLElement r9 = r9.getValue()
            java.lang.String r9 = r9.content()
            if (r9 == 0) goto L91
            r6.put(r10, r9)
        L91:
            int r8 = r8 + 1
            goto L78
        L94:
            androidx.constraintlayout.core.state.ConstraintSetParser$DesignElement r5 = new androidx.constraintlayout.core.state.ConstraintSetParser$DesignElement
            r5.<init>(r0, r4, r6)
            r12.add(r5)
        L9c:
            int r3 = r3 + 1
            goto L36
        L9f:
            return
    }

    public static androidx.constraintlayout.core.state.Dimension parseDimension(androidx.constraintlayout.core.parser.CLObject r3, java.lang.String r4, androidx.constraintlayout.core.state.State r5, androidx.constraintlayout.core.state.CorePixelDp r6) throws androidx.constraintlayout.core.parser.CLParsingException {
            androidx.constraintlayout.core.parser.CLElement r0 = r3.get(r4)
            r1 = 0
            androidx.constraintlayout.core.state.Dimension r1 = androidx.constraintlayout.core.state.Dimension.createFixed(r1)
            boolean r2 = r0 instanceof androidx.constraintlayout.core.parser.CLString
            if (r2 == 0) goto L16
            java.lang.String r3 = r0.content()
            androidx.constraintlayout.core.state.Dimension r3 = parseDimensionMode(r3)
            return r3
        L16:
            boolean r2 = r0 instanceof androidx.constraintlayout.core.parser.CLNumber
            if (r2 == 0) goto L2f
            float r3 = r3.getFloat(r4)
            float r3 = r6.toPixels(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            int r3 = r5.convertDimension(r3)
            androidx.constraintlayout.core.state.Dimension r3 = androidx.constraintlayout.core.state.Dimension.createFixed(r3)
            return r3
        L2f:
            boolean r3 = r0 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r3 == 0) goto L9a
            androidx.constraintlayout.core.parser.CLObject r0 = (androidx.constraintlayout.core.parser.CLObject) r0
            java.lang.String r3 = "value"
            java.lang.String r3 = r0.getStringOrNull(r3)
            if (r3 == 0) goto L42
            androidx.constraintlayout.core.state.Dimension r1 = parseDimensionMode(r3)
        L42:
            java.lang.String r3 = "min"
            androidx.constraintlayout.core.parser.CLElement r3 = r0.getOrNull(r3)
            if (r3 == 0) goto L6e
            boolean r4 = r3 instanceof androidx.constraintlayout.core.parser.CLNumber
            if (r4 == 0) goto L65
            androidx.constraintlayout.core.parser.CLNumber r3 = (androidx.constraintlayout.core.parser.CLNumber) r3
            float r3 = r3.getFloat()
            float r3 = r6.toPixels(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            int r3 = r5.convertDimension(r3)
            r1.min(r3)
            goto L6e
        L65:
            boolean r3 = r3 instanceof androidx.constraintlayout.core.parser.CLString
            if (r3 == 0) goto L6e
            java.lang.Object r3 = androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION
            r1.min(r3)
        L6e:
            java.lang.String r3 = "max"
            androidx.constraintlayout.core.parser.CLElement r3 = r0.getOrNull(r3)
            if (r3 == 0) goto L9a
            boolean r4 = r3 instanceof androidx.constraintlayout.core.parser.CLNumber
            if (r4 == 0) goto L91
            androidx.constraintlayout.core.parser.CLNumber r3 = (androidx.constraintlayout.core.parser.CLNumber) r3
            float r3 = r3.getFloat()
            float r3 = r6.toPixels(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            int r3 = r5.convertDimension(r3)
            r1.max(r3)
            return r1
        L91:
            boolean r3 = r3 instanceof androidx.constraintlayout.core.parser.CLString
            if (r3 == 0) goto L9a
            java.lang.Object r3 = androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION
            r1.max(r3)
        L9a:
            return r1
    }

    public static androidx.constraintlayout.core.state.Dimension parseDimensionMode(java.lang.String r4) {
            r0 = 0
            androidx.constraintlayout.core.state.Dimension r1 = androidx.constraintlayout.core.state.Dimension.createFixed(r0)
            r4.getClass()
            r2 = -1
            int r3 = r4.hashCode()
            switch(r3) {
                case -1460244870: goto L35;
                case -995424086: goto L29;
                case -895684237: goto L1d;
                case 3657802: goto L11;
                default: goto L10;
            }
        L10:
            goto L40
        L11:
            java.lang.String r3 = "wrap"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L1b
            goto L40
        L1b:
            r2 = 3
            goto L40
        L1d:
            java.lang.String r3 = "spread"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L27
            goto L40
        L27:
            r2 = 2
            goto L40
        L29:
            java.lang.String r3 = "parent"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L33
            goto L40
        L33:
            r2 = 1
            goto L40
        L35:
            java.lang.String r3 = "preferWrap"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L3f
            goto L40
        L3f:
            r2 = r0
        L40:
            switch(r2) {
                case 0: goto L8e;
                case 1: goto L89;
                case 2: goto L82;
                case 3: goto L7d;
                default: goto L43;
            }
        L43:
            java.lang.String r2 = "%"
            boolean r2 = r4.endsWith(r2)
            if (r2 == 0) goto L69
            r1 = 37
            int r1 = r4.indexOf(r1)
            java.lang.String r4 = r4.substring(r0, r1)
            float r4 = java.lang.Float.parseFloat(r4)
            r1 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            androidx.constraintlayout.core.state.Dimension r4 = androidx.constraintlayout.core.state.Dimension.createPercent(r1, r4)
            androidx.constraintlayout.core.state.Dimension r4 = r4.suggested(r0)
            return r4
        L69:
            java.lang.String r0 = ":"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L7c
            androidx.constraintlayout.core.state.Dimension r4 = androidx.constraintlayout.core.state.Dimension.createRatio(r4)
            java.lang.Object r0 = androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION
            androidx.constraintlayout.core.state.Dimension r4 = r4.suggested(r0)
            return r4
        L7c:
            return r1
        L7d:
            androidx.constraintlayout.core.state.Dimension r4 = androidx.constraintlayout.core.state.Dimension.createWrap()
            return r4
        L82:
            java.lang.Object r4 = androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION
            androidx.constraintlayout.core.state.Dimension r4 = androidx.constraintlayout.core.state.Dimension.createSuggested(r4)
            return r4
        L89:
            androidx.constraintlayout.core.state.Dimension r4 = androidx.constraintlayout.core.state.Dimension.createParent()
            return r4
        L8e:
            java.lang.Object r4 = androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION
            androidx.constraintlayout.core.state.Dimension r4 = androidx.constraintlayout.core.state.Dimension.createSuggested(r4)
            return r4
    }

    private static void parseFlowType(java.lang.String r17, androidx.constraintlayout.core.state.State r18, java.lang.String r19, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r20, androidx.constraintlayout.core.parser.CLObject r21) throws androidx.constraintlayout.core.parser.CLParsingException {
            r0 = r18
            r1 = r19
            r2 = r21
            r3 = 4
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = r17
            char r8 = r8.charAt(r7)
            r9 = 118(0x76, float:1.65E-43)
            r10 = 1
            if (r8 != r9) goto L17
            r8 = r10
            goto L18
        L17:
            r8 = r7
        L18:
            androidx.constraintlayout.core.state.helpers.FlowReference r8 = r0.getFlow(r1, r8)
            java.util.ArrayList r9 = r2.names()
            java.util.Iterator r9 = r9.iterator()
        L24:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L45b
            java.lang.Object r11 = r9.next()
            java.lang.String r11 = (java.lang.String) r11
            r11.getClass()
            r12 = 1056964608(0x3f000000, float:0.5)
            java.lang.String r13 = ""
            int r14 = r11.hashCode()
            switch(r14) {
                case -1254185091: goto Ld9;
                case -1237307863: goto Lcd;
                case -1198076529: goto Lc1;
                case -853376977: goto Lb5;
                case -836499749: goto La9;
                case -806339567: goto L9d;
                case -732635235: goto L91;
                case -567445985: goto L86;
                case -488900360: goto L78;
                case 3169614: goto L6b;
                case 3575610: goto L5d;
                case 3586688: goto L4f;
                case 3657802: goto L41;
                default: goto L3e;
            }
        L3e:
            r14 = -1
            goto Le4
        L41:
            java.lang.String r14 = "wrap"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L4b
            goto L3e
        L4b:
            r14 = 12
            goto Le4
        L4f:
            java.lang.String r14 = "vGap"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L59
            goto L3e
        L59:
            r14 = 11
            goto Le4
        L5d:
            java.lang.String r14 = "type"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L67
            goto L3e
        L67:
            r14 = 10
            goto Le4
        L6b:
            java.lang.String r14 = "hGap"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L74
            goto L3e
        L74:
            r14 = 9
            goto Le4
        L78:
            java.lang.String r14 = "maxElement"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L82
            goto L3e
        L82:
            r14 = 8
            goto Le4
        L86:
            java.lang.String r14 = "contains"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L8f
            goto L3e
        L8f:
            r14 = 7
            goto Le4
        L91:
            java.lang.String r14 = "vFlowBias"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto L9b
            goto L3e
        L9b:
            r14 = 6
            goto Le4
        L9d:
            java.lang.String r14 = "padding"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto La7
            goto L3e
        La7:
            r14 = 5
            goto Le4
        La9:
            java.lang.String r14 = "vStyle"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto Lb3
            goto L3e
        Lb3:
            r14 = r3
            goto Le4
        Lb5:
            java.lang.String r14 = "vAlign"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto Lbf
            goto L3e
        Lbf:
            r14 = r5
            goto Le4
        Lc1:
            java.lang.String r14 = "hFlowBias"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto Lcb
            goto L3e
        Lcb:
            r14 = r6
            goto Le4
        Lcd:
            java.lang.String r14 = "hStyle"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto Ld7
            goto L3e
        Ld7:
            r14 = r10
            goto Le4
        Ld9:
            java.lang.String r14 = "hAlign"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto Le3
            goto L3e
        Le3:
            r14 = r7
        Le4:
            switch(r14) {
                case 0: goto L42f;
                case 1: goto L3d9;
                case 2: goto L370;
                case 3: goto L322;
                case 4: goto L2cb;
                case 5: goto L260;
                case 6: goto L1f7;
                case 7: goto L14e;
                case 8: goto L13f;
                case 9: goto L130;
                case 10: goto L114;
                case 11: goto L105;
                case 12: goto Lf2;
                default: goto Le7;
            }
        Le7:
            androidx.constraintlayout.core.state.ConstraintReference r12 = r18.constraints(r19)
            r14 = r20
            applyAttribute(r0, r14, r12, r2, r11)
            goto L458
        Lf2:
            r14 = r20
            androidx.constraintlayout.core.parser.CLElement r11 = r2.get(r11)
            java.lang.String r11 = r11.content()
            int r11 = androidx.constraintlayout.core.state.State.Wrap.getValueByString(r11)
            r8.setWrapMode(r11)
            goto L458
        L105:
            r14 = r20
            androidx.constraintlayout.core.parser.CLElement r11 = r2.get(r11)
            int r11 = r11.getInt()
            r8.setVerticalGap(r11)
            goto L458
        L114:
            r14 = r20
            androidx.constraintlayout.core.parser.CLElement r11 = r2.get(r11)
            java.lang.String r11 = r11.content()
            java.lang.String r12 = "hFlow"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L12b
            r8.setOrientation(r7)
            goto L458
        L12b:
            r8.setOrientation(r10)
            goto L458
        L130:
            r14 = r20
            androidx.constraintlayout.core.parser.CLElement r11 = r2.get(r11)
            int r11 = r11.getInt()
            r8.setHorizontalGap(r11)
            goto L458
        L13f:
            r14 = r20
            androidx.constraintlayout.core.parser.CLElement r11 = r2.get(r11)
            int r11 = r11.getInt()
            r8.setMaxElementsWrap(r11)
            goto L458
        L14e:
            r14 = r20
            androidx.constraintlayout.core.parser.CLElement r11 = r2.get(r11)
            boolean r12 = r11 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r12 == 0) goto L1d4
            r12 = r11
            androidx.constraintlayout.core.parser.CLArray r12 = (androidx.constraintlayout.core.parser.CLArray) r12
            int r13 = r12.size()
            if (r13 >= r10) goto L163
            goto L1d4
        L163:
            r11 = r7
        L164:
            int r13 = r12.size()
            if (r11 >= r13) goto L458
            androidx.constraintlayout.core.parser.CLElement r13 = r12.get(r11)
            boolean r15 = r13 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r15 == 0) goto L1c6
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            int r15 = r13.size()
            if (r15 <= 0) goto L1d1
            androidx.constraintlayout.core.parser.CLElement r15 = r13.get(r7)
            java.lang.String r15 = r15.content()
            int r4 = r13.size()
            r16 = 2143289344(0x7fc00000, float:NaN)
            if (r4 == r6) goto L1bb
            if (r4 == r5) goto L1ac
            if (r4 == r3) goto L193
            r3 = r16
            r4 = r3
            r13 = r4
            goto L1c2
        L193:
            float r16 = r13.getFloat(r10)
            float r4 = r13.getFloat(r6)
            float r4 = toPix(r0, r4)
            float r13 = r13.getFloat(r5)
            float r13 = toPix(r0, r13)
            r3 = r13
            r13 = r4
        L1a9:
            r4 = r16
            goto L1c2
        L1ac:
            float r16 = r13.getFloat(r10)
            float r4 = r13.getFloat(r6)
            float r4 = toPix(r0, r4)
            r3 = r4
            r13 = r3
            goto L1a9
        L1bb:
            float r4 = r13.getFloat(r10)
            r3 = r16
            r13 = r3
        L1c2:
            r8.addFlowElement(r15, r4, r13, r3)
            goto L1d1
        L1c6:
            java.lang.String r3 = r13.content()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r8.add(r3)
        L1d1:
            int r11 = r11 + r10
            r3 = 4
            goto L164
        L1d4:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " contains should be an array \""
            r2.append(r1)
            java.lang.String r1 = r11.content()
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.println(r1)
            return
        L1f7:
            r14 = r20
            androidx.constraintlayout.core.parser.CLElement r3 = r2.get(r11)
            java.lang.Float r4 = java.lang.Float.valueOf(r12)
            java.lang.Float r11 = java.lang.Float.valueOf(r12)
            boolean r13 = r3 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r13 == 0) goto L231
            r13 = r3
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            int r15 = r13.size()
            if (r15 <= r10) goto L231
            float r3 = r13.getFloat(r7)
            java.lang.Float r4 = java.lang.Float.valueOf(r3)
            float r3 = r13.getFloat(r10)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            int r15 = r13.size()
            if (r15 <= r6) goto L239
            float r11 = r13.getFloat(r6)
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            goto L239
        L231:
            float r3 = r3.getFloat()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
        L239:
            float r3 = r3.floatValue()     // Catch: java.lang.NumberFormatException -> L458
            r8.verticalBias(r3)     // Catch: java.lang.NumberFormatException -> L458
            float r3 = r4.floatValue()     // Catch: java.lang.NumberFormatException -> L458
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 == 0) goto L24f
            float r3 = r4.floatValue()     // Catch: java.lang.NumberFormatException -> L458
            r8.setFirstVerticalBias(r3)     // Catch: java.lang.NumberFormatException -> L458
        L24f:
            float r3 = r11.floatValue()     // Catch: java.lang.NumberFormatException -> L458
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 == 0) goto L458
            float r3 = r11.floatValue()     // Catch: java.lang.NumberFormatException -> L458
            r8.setLastVerticalBias(r3)     // Catch: java.lang.NumberFormatException -> L458
            goto L458
        L260:
            r14 = r20
            androidx.constraintlayout.core.parser.CLElement r3 = r2.get(r11)
            boolean r4 = r3 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r4 == 0) goto L295
            r4 = r3
            androidx.constraintlayout.core.parser.CLArray r4 = (androidx.constraintlayout.core.parser.CLArray) r4
            int r11 = r4.size()
            if (r11 <= r10) goto L295
            int r11 = r4.getInt(r7)
            float r11 = (float) r11
            int r12 = r4.getInt(r10)
            float r12 = (float) r12
            int r13 = r4.size()
            if (r13 <= r6) goto L292
            int r4 = r4.getInt(r6)
            float r4 = (float) r4
            androidx.constraintlayout.core.parser.CLArray r3 = (androidx.constraintlayout.core.parser.CLArray) r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L290
            int r3 = r3.getInt(r5)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L290
            float r3 = (float) r3
            goto L29d
        L290:
            r3 = 0
            goto L29d
        L292:
            r4 = r11
            r3 = r12
            goto L29d
        L295:
            int r3 = r3.getInt()
            float r11 = (float) r3
            r3 = r11
            r4 = r3
            r12 = r4
        L29d:
            float r11 = toPix(r0, r11)
            int r11 = java.lang.Math.round(r11)
            r8.setPaddingLeft(r11)
            float r11 = toPix(r0, r12)
            int r11 = java.lang.Math.round(r11)
            r8.setPaddingTop(r11)
            float r4 = toPix(r0, r4)
            int r4 = java.lang.Math.round(r4)
            r8.setPaddingRight(r4)
            float r3 = toPix(r0, r3)
            int r3 = java.lang.Math.round(r3)
            r8.setPaddingBottom(r3)
            goto L458
        L2cb:
            r14 = r20
            androidx.constraintlayout.core.parser.CLElement r3 = r2.get(r11)
            boolean r4 = r3 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r4 == 0) goto L2f3
            r4 = r3
            androidx.constraintlayout.core.parser.CLArray r4 = (androidx.constraintlayout.core.parser.CLArray) r4
            int r11 = r4.size()
            if (r11 <= r10) goto L2f3
            java.lang.String r3 = r4.getString(r7)
            java.lang.String r11 = r4.getString(r10)
            int r12 = r4.size()
            if (r12 <= r6) goto L2f1
            java.lang.String r4 = r4.getString(r6)
            goto L2f9
        L2f1:
            r4 = r13
            goto L2f9
        L2f3:
            java.lang.String r11 = r3.content()
            r3 = r13
            r4 = r3
        L2f9:
            boolean r12 = r11.equals(r13)
            if (r12 != 0) goto L306
            int r11 = androidx.constraintlayout.core.state.State.Chain.getValueByString(r11)
            r8.setVerticalStyle(r11)
        L306:
            boolean r11 = r3.equals(r13)
            if (r11 != 0) goto L313
            int r3 = androidx.constraintlayout.core.state.State.Chain.getValueByString(r3)
            r8.setFirstVerticalStyle(r3)
        L313:
            boolean r3 = r4.equals(r13)
            if (r3 != 0) goto L458
            int r3 = androidx.constraintlayout.core.state.State.Chain.getValueByString(r4)
            r8.setLastVerticalStyle(r3)
            goto L458
        L322:
            r14 = r20
            androidx.constraintlayout.core.parser.CLElement r3 = r2.get(r11)
            java.lang.String r3 = r3.content()
            r3.getClass()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1720785339: goto L34f;
                case -1383228885: goto L344;
                case 115029: goto L338;
                default: goto L336;
            }
        L336:
            r3 = -1
            goto L359
        L338:
            java.lang.String r4 = "top"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L342
            goto L336
        L342:
            r3 = r6
            goto L359
        L344:
            java.lang.String r4 = "bottom"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L34d
            goto L336
        L34d:
            r3 = r10
            goto L359
        L34f:
            java.lang.String r4 = "baseline"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L358
            goto L336
        L358:
            r3 = r7
        L359:
            switch(r3) {
                case 0: goto L36b;
                case 1: goto L366;
                case 2: goto L361;
                default: goto L35c;
            }
        L35c:
            r8.setVerticalAlign(r6)
            goto L458
        L361:
            r8.setVerticalAlign(r7)
            goto L458
        L366:
            r8.setVerticalAlign(r10)
            goto L458
        L36b:
            r8.setVerticalAlign(r5)
            goto L458
        L370:
            r14 = r20
            androidx.constraintlayout.core.parser.CLElement r3 = r2.get(r11)
            java.lang.Float r4 = java.lang.Float.valueOf(r12)
            java.lang.Float r11 = java.lang.Float.valueOf(r12)
            boolean r13 = r3 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r13 == 0) goto L3aa
            r13 = r3
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            int r15 = r13.size()
            if (r15 <= r10) goto L3aa
            float r3 = r13.getFloat(r7)
            java.lang.Float r4 = java.lang.Float.valueOf(r3)
            float r3 = r13.getFloat(r10)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            int r15 = r13.size()
            if (r15 <= r6) goto L3b2
            float r11 = r13.getFloat(r6)
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            goto L3b2
        L3aa:
            float r3 = r3.getFloat()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
        L3b2:
            float r3 = r3.floatValue()     // Catch: java.lang.NumberFormatException -> L458
            r8.horizontalBias(r3)     // Catch: java.lang.NumberFormatException -> L458
            float r3 = r4.floatValue()     // Catch: java.lang.NumberFormatException -> L458
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 == 0) goto L3c8
            float r3 = r4.floatValue()     // Catch: java.lang.NumberFormatException -> L458
            r8.setFirstHorizontalBias(r3)     // Catch: java.lang.NumberFormatException -> L458
        L3c8:
            float r3 = r11.floatValue()     // Catch: java.lang.NumberFormatException -> L458
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 == 0) goto L458
            float r3 = r11.floatValue()     // Catch: java.lang.NumberFormatException -> L458
            r8.setLastHorizontalBias(r3)     // Catch: java.lang.NumberFormatException -> L458
            goto L458
        L3d9:
            r14 = r20
            androidx.constraintlayout.core.parser.CLElement r3 = r2.get(r11)
            boolean r4 = r3 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r4 == 0) goto L401
            r4 = r3
            androidx.constraintlayout.core.parser.CLArray r4 = (androidx.constraintlayout.core.parser.CLArray) r4
            int r11 = r4.size()
            if (r11 <= r10) goto L401
            java.lang.String r3 = r4.getString(r7)
            java.lang.String r11 = r4.getString(r10)
            int r12 = r4.size()
            if (r12 <= r6) goto L3ff
            java.lang.String r4 = r4.getString(r6)
            goto L407
        L3ff:
            r4 = r13
            goto L407
        L401:
            java.lang.String r11 = r3.content()
            r3 = r13
            r4 = r3
        L407:
            boolean r12 = r11.equals(r13)
            if (r12 != 0) goto L414
            int r11 = androidx.constraintlayout.core.state.State.Chain.getValueByString(r11)
            r8.setHorizontalStyle(r11)
        L414:
            boolean r11 = r3.equals(r13)
            if (r11 != 0) goto L421
            int r3 = androidx.constraintlayout.core.state.State.Chain.getValueByString(r3)
            r8.setFirstHorizontalStyle(r3)
        L421:
            boolean r3 = r4.equals(r13)
            if (r3 != 0) goto L458
            int r3 = androidx.constraintlayout.core.state.State.Chain.getValueByString(r4)
            r8.setLastHorizontalStyle(r3)
            goto L458
        L42f:
            r14 = r20
            androidx.constraintlayout.core.parser.CLElement r3 = r2.get(r11)
            java.lang.String r3 = r3.content()
            r3.getClass()
            java.lang.String r4 = "end"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L455
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L451
            r8.setHorizontalAlign(r6)
            goto L458
        L451:
            r8.setHorizontalAlign(r7)
            goto L458
        L455:
            r8.setHorizontalAlign(r10)
        L458:
            r3 = 4
            goto L24
        L45b:
            return
    }

    public static void parseGenerate(androidx.constraintlayout.core.state.State r5, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r6, androidx.constraintlayout.core.parser.CLObject r7) throws androidx.constraintlayout.core.parser.CLParsingException {
            java.util.ArrayList r0 = r7.names()
            if (r0 != 0) goto L7
            goto L3c
        L7:
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            androidx.constraintlayout.core.parser.CLElement r2 = r7.get(r1)
            java.util.ArrayList r1 = r6.getList(r1)
            if (r1 == 0) goto Lb
            boolean r3 = r2 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r3 == 0) goto Lb
            java.util.Iterator r1 = r1.iterator()
        L29:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lb
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r4 = r2
            androidx.constraintlayout.core.parser.CLObject r4 = (androidx.constraintlayout.core.parser.CLObject) r4
            parseWidget(r5, r6, r3, r4)
            goto L29
        L3c:
            return
    }

    private static void parseGridType(java.lang.String r10, androidx.constraintlayout.core.state.State r11, java.lang.String r12, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r13, androidx.constraintlayout.core.parser.CLObject r14) throws androidx.constraintlayout.core.parser.CLParsingException {
            r0 = 3
            r1 = 2
            r2 = 0
            r3 = 1
            androidx.constraintlayout.core.state.helpers.GridReference r10 = r11.getGrid(r12, r10)
            java.util.ArrayList r4 = r14.names()
            java.util.Iterator r4 = r4.iterator()
        L10:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L23a
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            java.lang.String r6 = ":"
            java.lang.String r7 = ","
            r8 = -1
            int r9 = r5.hashCode()
            switch(r9) {
                case -1439500848: goto Lb8;
                case -806339567: goto Lac;
                case -567445985: goto La1;
                case 3169614: goto L96;
                case 3506649: goto L8a;
                case 3586688: goto L7e;
                case 97513095: goto L73;
                case 109497044: goto L67;
                case 109638249: goto L58;
                case 144441793: goto L49;
                case 949721053: goto L3b;
                case 2033353925: goto L2d;
                default: goto L2b;
            }
        L2b:
            goto Lc3
        L2d:
            java.lang.String r9 = "columnWeights"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L37
            goto Lc3
        L37:
            r8 = 11
            goto Lc3
        L3b:
            java.lang.String r9 = "columns"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L45
            goto Lc3
        L45:
            r8 = 10
            goto Lc3
        L49:
            java.lang.String r9 = "rowWeights"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L54
            goto Lc3
        L54:
            r8 = 9
            goto Lc3
        L58:
            java.lang.String r9 = "spans"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L63
            goto Lc3
        L63:
            r8 = 8
            goto Lc3
        L67:
            java.lang.String r9 = "skips"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L71
            goto Lc3
        L71:
            r8 = 7
            goto Lc3
        L73:
            java.lang.String r9 = "flags"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L7c
            goto Lc3
        L7c:
            r8 = 6
            goto Lc3
        L7e:
            java.lang.String r9 = "vGap"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L88
            goto Lc3
        L88:
            r8 = 5
            goto Lc3
        L8a:
            java.lang.String r9 = "rows"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L94
            goto Lc3
        L94:
            r8 = 4
            goto Lc3
        L96:
            java.lang.String r9 = "hGap"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L9f
            goto Lc3
        L9f:
            r8 = r0
            goto Lc3
        La1:
            java.lang.String r9 = "contains"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto Laa
            goto Lc3
        Laa:
            r8 = r1
            goto Lc3
        Lac:
            java.lang.String r9 = "padding"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto Lb6
            goto Lc3
        Lb6:
            r8 = r3
            goto Lc3
        Lb8:
            java.lang.String r9 = "orientation"
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto Lc2
            goto Lc3
        Lc2:
            r8 = r2
        Lc3:
            switch(r8) {
                case 0: goto L22d;
                case 1: goto L1c4;
                case 2: goto L1a2;
                case 3: goto L191;
                case 4: goto L182;
                case 5: goto L171;
                case 6: goto L132;
                case 7: goto L11d;
                case 8: goto L108;
                case 9: goto Lf3;
                case 10: goto Le4;
                case 11: goto Lcf;
                default: goto Lc6;
            }
        Lc6:
            androidx.constraintlayout.core.state.ConstraintReference r6 = r11.constraints(r12)
            applyAttribute(r11, r13, r6, r14, r5)
            goto L10
        Lcf:
            androidx.constraintlayout.core.parser.CLElement r5 = r14.get(r5)
            java.lang.String r5 = r5.content()
            if (r5 == 0) goto L10
            boolean r6 = r5.contains(r7)
            if (r6 == 0) goto L10
            r10.setColumnWeights(r5)
            goto L10
        Le4:
            androidx.constraintlayout.core.parser.CLElement r5 = r14.get(r5)
            int r5 = r5.getInt()
            if (r5 <= 0) goto L10
            r10.setColumnsSet(r5)
            goto L10
        Lf3:
            androidx.constraintlayout.core.parser.CLElement r5 = r14.get(r5)
            java.lang.String r5 = r5.content()
            if (r5 == 0) goto L10
            boolean r6 = r5.contains(r7)
            if (r6 == 0) goto L10
            r10.setRowWeights(r5)
            goto L10
        L108:
            androidx.constraintlayout.core.parser.CLElement r5 = r14.get(r5)
            java.lang.String r5 = r5.content()
            if (r5 == 0) goto L10
            boolean r6 = r5.contains(r6)
            if (r6 == 0) goto L10
            r10.setSpans(r5)
            goto L10
        L11d:
            androidx.constraintlayout.core.parser.CLElement r5 = r14.get(r5)
            java.lang.String r5 = r5.content()
            if (r5 == 0) goto L10
            boolean r6 = r5.contains(r6)
            if (r6 == 0) goto L10
            r10.setSkips(r5)
            goto L10
        L132:
            java.lang.String r6 = ""
            androidx.constraintlayout.core.parser.CLElement r5 = r14.get(r5)     // Catch: java.lang.Exception -> L141
            boolean r7 = r5 instanceof androidx.constraintlayout.core.parser.CLNumber     // Catch: java.lang.Exception -> L141
            if (r7 == 0) goto L143
            int r5 = r5.getInt()     // Catch: java.lang.Exception -> L141
            goto L15f
        L141:
            r5 = move-exception
            goto L148
        L143:
            java.lang.String r6 = r5.content()     // Catch: java.lang.Exception -> L141
            goto L15e
        L148:
            java.io.PrintStream r7 = java.lang.System.err
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Error parsing grid flags "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r7.println(r5)
        L15e:
            r5 = r2
        L15f:
            if (r6 == 0) goto L16c
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L16c
            r10.setFlags(r6)
            goto L10
        L16c:
            r10.setFlags(r5)
            goto L10
        L171:
            androidx.constraintlayout.core.parser.CLElement r5 = r14.get(r5)
            float r5 = r5.getFloat()
            float r5 = toPix(r11, r5)
            r10.setVerticalGaps(r5)
            goto L10
        L182:
            androidx.constraintlayout.core.parser.CLElement r5 = r14.get(r5)
            int r5 = r5.getInt()
            if (r5 <= 0) goto L10
            r10.setRowsSet(r5)
            goto L10
        L191:
            androidx.constraintlayout.core.parser.CLElement r5 = r14.get(r5)
            float r5 = r5.getFloat()
            float r5 = toPix(r11, r5)
            r10.setHorizontalGaps(r5)
            goto L10
        L1a2:
            androidx.constraintlayout.core.parser.CLArray r5 = r14.getArrayOrNull(r5)
            if (r5 == 0) goto L10
            r6 = r2
        L1a9:
            int r7 = r5.size()
            if (r6 >= r7) goto L10
            androidx.constraintlayout.core.parser.CLElement r7 = r5.get(r6)
            java.lang.String r7 = r7.content()
            androidx.constraintlayout.core.state.ConstraintReference r7 = r11.constraints(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            r10.add(r7)
            int r6 = r6 + r3
            goto L1a9
        L1c4:
            androidx.constraintlayout.core.parser.CLElement r5 = r14.get(r5)
            boolean r6 = r5 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r6 == 0) goto L1f7
            r6 = r5
            androidx.constraintlayout.core.parser.CLArray r6 = (androidx.constraintlayout.core.parser.CLArray) r6
            int r7 = r6.size()
            if (r7 <= r3) goto L1f7
            int r7 = r6.getInt(r2)
            float r7 = (float) r7
            int r8 = r6.getInt(r3)
            float r8 = (float) r8
            int r9 = r6.size()
            if (r9 <= r1) goto L1f4
            int r6 = r6.getInt(r1)
            float r6 = (float) r6
            androidx.constraintlayout.core.parser.CLArray r5 = (androidx.constraintlayout.core.parser.CLArray) r5     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1f2
            int r5 = r5.getInt(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1f2
            float r5 = (float) r5
            goto L1ff
        L1f2:
            r5 = 0
            goto L1ff
        L1f4:
            r6 = r7
            r5 = r8
            goto L1ff
        L1f7:
            int r5 = r5.getInt()
            float r7 = (float) r5
            r5 = r7
            r6 = r5
            r8 = r6
        L1ff:
            float r7 = toPix(r11, r7)
            int r7 = java.lang.Math.round(r7)
            r10.setPaddingStart(r7)
            float r7 = toPix(r11, r8)
            int r7 = java.lang.Math.round(r7)
            r10.setPaddingTop(r7)
            float r6 = toPix(r11, r6)
            int r6 = java.lang.Math.round(r6)
            r10.setPaddingEnd(r6)
            float r5 = toPix(r11, r5)
            int r5 = java.lang.Math.round(r5)
            r10.setPaddingBottom(r5)
            goto L10
        L22d:
            androidx.constraintlayout.core.parser.CLElement r5 = r14.get(r5)
            int r5 = r5.getInt()
            r10.setOrientation(r5)
            goto L10
        L23a:
            return
    }

    public static void parseGuideline(int r1, androidx.constraintlayout.core.state.State r2, androidx.constraintlayout.core.parser.CLArray r3) throws androidx.constraintlayout.core.parser.CLParsingException {
            r0 = 1
            androidx.constraintlayout.core.parser.CLElement r3 = r3.get(r0)
            boolean r0 = r3 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r0 != 0) goto La
            goto L14
        La:
            androidx.constraintlayout.core.parser.CLObject r3 = (androidx.constraintlayout.core.parser.CLObject) r3
            java.lang.String r0 = "id"
            java.lang.String r0 = r3.getStringOrNull(r0)
            if (r0 != 0) goto L15
        L14:
            return
        L15:
            parseGuidelineParams(r1, r2, r0, r3)
            return
    }

    public static void parseGuidelineParams(int r18, androidx.constraintlayout.core.state.State r19, java.lang.String r20, androidx.constraintlayout.core.parser.CLObject r21) throws androidx.constraintlayout.core.parser.CLParsingException {
            r0 = r19
            r1 = r21
            java.lang.String r2 = "start"
            java.lang.String r4 = "right"
            java.lang.String r6 = "left"
            java.lang.String r7 = "end"
            r8 = -1
            r9 = 0
            r10 = 1
            java.util.ArrayList r11 = r1.names()
            if (r11 != 0) goto L19
            return
        L19:
            androidx.constraintlayout.core.state.ConstraintReference r12 = r19.constraints(r20)
            if (r18 != 0) goto L23
            r19.horizontalGuideline(r20)
            goto L26
        L23:
            r19.verticalGuideline(r20)
        L26:
            boolean r13 = r0.isRtl()
            if (r13 == 0) goto L31
            if (r18 != 0) goto L2f
            goto L31
        L2f:
            r13 = r9
            goto L32
        L31:
            r13 = r10
        L32:
            androidx.constraintlayout.core.state.helpers.Facade r12 = r12.getFacade()
            androidx.constraintlayout.core.state.helpers.GuidelineReference r12 = (androidx.constraintlayout.core.state.helpers.GuidelineReference) r12
            java.util.Iterator r11 = r11.iterator()
            r14 = 0
            r15 = r9
        L3e:
            r16 = r10
        L40:
            boolean r17 = r11.hasNext()
            if (r17 == 0) goto L11e
            java.lang.Object r17 = r11.next()
            r3 = r17
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            int r17 = r3.hashCode()
            switch(r17) {
                case -678927291: goto L81;
                case 100571: goto L78;
                case 3317767: goto L6f;
                case 108511772: goto L66;
                case 109757538: goto L5a;
                default: goto L58;
            }
        L58:
            r5 = r8
            goto L8c
        L5a:
            boolean r17 = r3.equals(r2)
            if (r17 != 0) goto L61
            goto L58
        L61:
            r17 = 4
            r5 = r17
            goto L8c
        L66:
            boolean r17 = r3.equals(r4)
            if (r17 != 0) goto L6d
            goto L58
        L6d:
            r5 = 3
            goto L8c
        L6f:
            boolean r17 = r3.equals(r6)
            if (r17 != 0) goto L76
            goto L58
        L76:
            r5 = 2
            goto L8c
        L78:
            boolean r17 = r3.equals(r7)
            if (r17 != 0) goto L7f
            goto L58
        L7f:
            r5 = r10
            goto L8c
        L81:
            java.lang.String r5 = "percent"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L8b
            goto L58
        L8b:
            r5 = r9
        L8c:
            switch(r5) {
                case 0: goto Lbe;
                case 1: goto Lb2;
                case 2: goto La8;
                case 3: goto L9c;
                case 4: goto L90;
                default: goto L8f;
            }
        L8f:
            goto L40
        L90:
            float r3 = r1.getFloat(r3)
            float r3 = toPix(r0, r3)
            r14 = r3
        L99:
            r16 = r13
            goto L40
        L9c:
            float r3 = r1.getFloat(r3)
            float r3 = toPix(r0, r3)
            r14 = r3
            r16 = r9
            goto L40
        La8:
            float r3 = r1.getFloat(r3)
            float r3 = toPix(r0, r3)
            r14 = r3
            goto L3e
        Lb2:
            float r3 = r1.getFloat(r3)
            float r3 = toPix(r0, r3)
            r16 = r13 ^ 1
            r14 = r3
            goto L40
        Lbe:
            androidx.constraintlayout.core.parser.CLArray r5 = r1.getArrayOrNull(r3)
            if (r5 != 0) goto Lce
            float r3 = r1.getFloat(r3)
            r14 = r3
        Lc9:
            r15 = r10
            r16 = r15
            goto L40
        Lce:
            int r3 = r5.size()
            if (r3 <= r10) goto L10f
            java.lang.String r3 = r5.getString(r9)
            float r5 = r5.getFloat(r10)
            r3.getClass()
            int r14 = r3.hashCode()
            switch(r14) {
                case 100571: goto L103;
                case 3317767: goto Lfa;
                case 108511772: goto Lf1;
                case 109757538: goto Le8;
                default: goto Le6;
            }
        Le6:
            r3 = r8
            goto L10b
        Le8:
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto Lef
            goto Le6
        Lef:
            r3 = 3
            goto L10b
        Lf1:
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Lf8
            goto Le6
        Lf8:
            r3 = 2
            goto L10b
        Lfa:
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L101
            goto Le6
        L101:
            r3 = r10
            goto L10b
        L103:
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L10a
            goto Le6
        L10a:
            r3 = r9
        L10b:
            switch(r3) {
                case 0: goto L11b;
                case 1: goto L119;
                case 2: goto L115;
                case 3: goto L112;
                default: goto L10e;
            }
        L10e:
            r14 = r5
        L10f:
            r15 = r10
            goto L40
        L112:
            r14 = r5
            r15 = r10
            goto L99
        L115:
            r14 = r5
            r16 = r9
            goto L10f
        L119:
            r14 = r5
            goto Lc9
        L11b:
            r16 = r13 ^ 1
            goto L10e
        L11e:
            if (r15 == 0) goto L12d
            if (r16 == 0) goto L126
            r12.percent(r14)
            return
        L126:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r14
            r12.percent(r0)
            return
        L12d:
            if (r16 == 0) goto L137
            java.lang.Float r0 = java.lang.Float.valueOf(r14)
            r12.start(r0)
            return
        L137:
            java.lang.Float r0 = java.lang.Float.valueOf(r14)
            r12.end(r0)
            return
    }

    public static void parseHeader(androidx.constraintlayout.core.state.CoreMotionScene r1, androidx.constraintlayout.core.parser.CLObject r2) {
            java.lang.String r0 = "export"
            java.lang.String r2 = r2.getStringOrNull(r0)
            if (r2 == 0) goto Lb
            r1.setDebugName(r2)
        Lb:
            return
    }

    public static void parseHelpers(androidx.constraintlayout.core.state.State r7, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r8, androidx.constraintlayout.core.parser.CLArray r9) throws androidx.constraintlayout.core.parser.CLParsingException {
            r0 = 1
            r1 = 0
            r2 = r1
        L3:
            int r3 = r9.size()
            if (r2 >= r3) goto L6b
            androidx.constraintlayout.core.parser.CLElement r3 = r9.get(r2)
            boolean r4 = r3 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r4 == 0) goto L69
            androidx.constraintlayout.core.parser.CLArray r3 = (androidx.constraintlayout.core.parser.CLArray) r3
            int r4 = r3.size()
            if (r4 <= r0) goto L69
            java.lang.String r4 = r3.getString(r1)
            r4.getClass()
            r5 = -1
            int r6 = r4.hashCode()
            switch(r6) {
                case -1785507558: goto L4b;
                case -1252464839: goto L40;
                case -851656725: goto L34;
                case 965681512: goto L29;
                default: goto L28;
            }
        L28:
            goto L56
        L29:
            java.lang.String r6 = "hGuideline"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L32
            goto L56
        L32:
            r5 = 3
            goto L56
        L34:
            java.lang.String r6 = "vChain"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L3e
            goto L56
        L3e:
            r5 = 2
            goto L56
        L40:
            java.lang.String r6 = "hChain"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L49
            goto L56
        L49:
            r5 = r0
            goto L56
        L4b:
            java.lang.String r6 = "vGuideline"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L55
            goto L56
        L55:
            r5 = r1
        L56:
            switch(r5) {
                case 0: goto L66;
                case 1: goto L62;
                case 2: goto L5e;
                case 3: goto L5a;
                default: goto L59;
            }
        L59:
            goto L69
        L5a:
            parseGuideline(r1, r7, r3)
            goto L69
        L5e:
            parseChain(r0, r7, r8, r3)
            goto L69
        L62:
            parseChain(r1, r7, r8, r3)
            goto L69
        L66:
            parseGuideline(r0, r7, r3)
        L69:
            int r2 = r2 + r0
            goto L3
        L6b:
            return
    }

    public static void parseJSON(java.lang.String r1, androidx.constraintlayout.core.state.State r2, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r3) throws androidx.constraintlayout.core.parser.CLParsingException {
            androidx.constraintlayout.core.parser.CLObject r1 = androidx.constraintlayout.core.parser.CLParser.parse(r1)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L8
            populateState(r1, r2, r3)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L8
            return
        L8:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Error parsing JSON "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.println(r1)
            return
    }

    public static void parseJSON(java.lang.String r9, androidx.constraintlayout.core.state.Transition r10, int r11) {
            androidx.constraintlayout.core.parser.CLObject r9 = androidx.constraintlayout.core.parser.CLParser.parse(r9)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            java.util.ArrayList r0 = r9.names()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            if (r0 != 0) goto Lc
            goto L80
        Lc:
            java.util.Iterator r0 = r0.iterator()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
        L10:
            boolean r1 = r0.hasNext()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            if (r1 == 0) goto L80
            java.lang.Object r1 = r0.next()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            java.lang.String r1 = (java.lang.String) r1     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            androidx.constraintlayout.core.parser.CLElement r2 = r9.get(r1)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            boolean r3 = r2 instanceof androidx.constraintlayout.core.parser.CLObject     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            if (r3 == 0) goto L10
            androidx.constraintlayout.core.parser.CLObject r2 = (androidx.constraintlayout.core.parser.CLObject) r2     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            java.lang.String r3 = "custom"
            androidx.constraintlayout.core.parser.CLObject r2 = r2.getObjectOrNull(r3)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            if (r2 == 0) goto L10
            java.util.ArrayList r3 = r2.names()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            java.util.Iterator r3 = r3.iterator()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
        L36:
            boolean r4 = r3.hasNext()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            if (r4 == 0) goto L10
            java.lang.Object r4 = r3.next()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            java.lang.String r4 = (java.lang.String) r4     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            androidx.constraintlayout.core.parser.CLElement r5 = r2.get(r4)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            boolean r6 = r5 instanceof androidx.constraintlayout.core.parser.CLNumber     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            if (r6 == 0) goto L52
            float r5 = r5.getFloat()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            r10.addCustomFloat(r11, r1, r4, r5)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            goto L36
        L52:
            boolean r6 = r5 instanceof androidx.constraintlayout.core.parser.CLString     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            if (r6 == 0) goto L36
            java.lang.String r5 = r5.content()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            long r5 = parseColorString(r5)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            r7 = -1
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L36
            int r5 = (int) r5     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            r10.addCustomColor(r11, r1, r4, r5)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L69
            goto L36
        L69:
            r9 = move-exception
            java.io.PrintStream r10 = java.lang.System.err
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Error parsing JSON "
            r11.append(r0)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.println(r9)
        L80:
            return
    }

    private static void parseMotionProperties(androidx.constraintlayout.core.parser.CLElement r13, androidx.constraintlayout.core.state.ConstraintReference r14) throws androidx.constraintlayout.core.parser.CLParsingException {
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = -1
            boolean r4 = r13 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r4 != 0) goto L9
            goto L16
        L9:
            androidx.constraintlayout.core.parser.CLObject r13 = (androidx.constraintlayout.core.parser.CLObject) r13
            androidx.constraintlayout.core.motion.utils.TypedBundle r4 = new androidx.constraintlayout.core.motion.utils.TypedBundle
            r4.<init>()
            java.util.ArrayList r5 = r13.names()
            if (r5 != 0) goto L17
        L16:
            return
        L17:
            java.util.Iterator r5 = r5.iterator()
        L1b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L113
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            int r7 = r6.hashCode()
            switch(r7) {
                case -1897525331: goto L62;
                case -1310311125: goto L57;
                case -1285003983: goto L4b;
                case -791482387: goto L3f;
                case -236944793: goto L33;
                default: goto L31;
            }
        L31:
            r7 = r3
            goto L6d
        L33:
            java.lang.String r7 = "relativeTo"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L3d
            goto L31
        L3d:
            r7 = 4
            goto L6d
        L3f:
            java.lang.String r7 = "pathArc"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L49
            goto L31
        L49:
            r7 = 3
            goto L6d
        L4b:
            java.lang.String r7 = "quantize"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L55
            goto L31
        L55:
            r7 = r0
            goto L6d
        L57:
            java.lang.String r7 = "easing"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L60
            goto L31
        L60:
            r7 = r1
            goto L6d
        L62:
            java.lang.String r7 = "stagger"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L6c
            goto L31
        L6c:
            r7 = r2
        L6d:
            switch(r7) {
                case 0: goto L108;
                case 1: goto Lfd;
                case 2: goto Lc3;
                case 3: goto L7b;
                case 4: goto L71;
                default: goto L70;
            }
        L70:
            goto L1b
        L71:
            r7 = 605(0x25d, float:8.48E-43)
            java.lang.String r6 = r13.getString(r6)
            r4.add(r7, r6)
            goto L1b
        L7b:
            java.lang.String r6 = r13.getString(r6)
            java.lang.String r11 = "below"
            java.lang.String r12 = "above"
            java.lang.String r7 = "none"
            java.lang.String r8 = "startVertical"
            java.lang.String r9 = "startHorizontal"
            java.lang.String r10 = "flip"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8, r9, r10, r11, r12}
            int r7 = indexOf(r6, r7)
            if (r7 != r3) goto Lbc
            java.io.PrintStream r7 = java.lang.System.err
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r9 = r13.getLine()
            r8.append(r9)
            java.lang.String r9 = " pathArc = '"
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = "'"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.println(r6)
            goto L1b
        Lbc:
            r6 = 607(0x25f, float:8.5E-43)
            r4.add(r6, r7)
            goto L1b
        Lc3:
            androidx.constraintlayout.core.parser.CLElement r7 = r13.get(r6)
            boolean r8 = r7 instanceof androidx.constraintlayout.core.parser.CLArray
            r9 = 610(0x262, float:8.55E-43)
            if (r8 == 0) goto Lf4
            androidx.constraintlayout.core.parser.CLArray r7 = (androidx.constraintlayout.core.parser.CLArray) r7
            int r6 = r7.size()
            if (r6 <= 0) goto L1b
            int r8 = r7.getInt(r2)
            r4.add(r9, r8)
            if (r6 <= r1) goto L1b
            r8 = 611(0x263, float:8.56E-43)
            java.lang.String r9 = r7.getString(r1)
            r4.add(r8, r9)
            if (r6 <= r0) goto L1b
            r6 = 602(0x25a, float:8.44E-43)
            float r7 = r7.getFloat(r0)
            r4.add(r6, r7)
            goto L1b
        Lf4:
            int r6 = r13.getInt(r6)
            r4.add(r9, r6)
            goto L1b
        Lfd:
            r7 = 603(0x25b, float:8.45E-43)
            java.lang.String r6 = r13.getString(r6)
            r4.add(r7, r6)
            goto L1b
        L108:
            r7 = 600(0x258, float:8.41E-43)
            float r6 = r13.getFloat(r6)
            r4.add(r7, r6)
            goto L1b
        L113:
            r14.mMotionProperties = r4
            return
    }

    public static void parseMotionSceneJSON(androidx.constraintlayout.core.state.CoreMotionScene r7, java.lang.String r8) {
            androidx.constraintlayout.core.parser.CLObject r8 = androidx.constraintlayout.core.parser.CLParser.parse(r8)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L6e
            java.util.ArrayList r0 = r8.names()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L6e
            if (r0 != 0) goto Lc
            goto L85
        Lc:
            java.util.Iterator r0 = r0.iterator()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L6e
        L10:
            boolean r1 = r0.hasNext()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L6e
            if (r1 == 0) goto L85
            java.lang.Object r1 = r0.next()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L6e
            java.lang.String r1 = (java.lang.String) r1     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L6e
            androidx.constraintlayout.core.parser.CLElement r2 = r8.get(r1)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L6e
            boolean r3 = r2 instanceof androidx.constraintlayout.core.parser.CLObject     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L6e
            if (r3 == 0) goto L10
            androidx.constraintlayout.core.parser.CLObject r2 = (androidx.constraintlayout.core.parser.CLObject) r2     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L6e
            int r3 = r1.hashCode()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L6e
            r4 = -2137403731(0xffffffff8099cead, float:-1.4124972E-38)
            r5 = 2
            r6 = 1
            if (r3 == r4) goto L50
            r4 = -241441378(0xfffffffff19be59e, float:-1.5439285E30)
            if (r3 == r4) goto L46
            r4 = 1101852654(0x41acefee, float:21.617153)
            if (r3 == r4) goto L3c
            goto L5a
        L3c:
            java.lang.String r3 = "ConstraintSets"
            boolean r1 = r1.equals(r3)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L6e
            if (r1 == 0) goto L5a
            r1 = 0
            goto L5b
        L46:
            java.lang.String r3 = "Transitions"
            boolean r1 = r1.equals(r3)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L6e
            if (r1 == 0) goto L5a
            r1 = r6
            goto L5b
        L50:
            java.lang.String r3 = "Header"
            boolean r1 = r1.equals(r3)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L6e
            if (r1 == 0) goto L5a
            r1 = r5
            goto L5b
        L5a:
            r1 = -1
        L5b:
            if (r1 == 0) goto L6a
            if (r1 == r6) goto L66
            if (r1 == r5) goto L62
            goto L10
        L62:
            parseHeader(r7, r2)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L6e
            goto L10
        L66:
            parseTransitions(r7, r2)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L6e
            goto L10
        L6a:
            parseConstraintSets(r7, r2)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L6e
            goto L10
        L6e:
            r7 = move-exception
            java.io.PrintStream r8 = java.lang.System.err
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error parsing JSON "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.println(r7)
        L85:
            return
    }

    public static void parseTransitions(androidx.constraintlayout.core.state.CoreMotionScene r3, androidx.constraintlayout.core.parser.CLObject r4) throws androidx.constraintlayout.core.parser.CLParsingException {
            java.util.ArrayList r0 = r4.names()
            if (r0 != 0) goto L7
            goto L23
        L7:
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            androidx.constraintlayout.core.parser.CLObject r2 = r4.getObject(r1)
            java.lang.String r2 = r2.toJSON()
            r3.setTransitionContent(r1, r2)
            goto Lb
        L23:
            return
    }

    private static void parseVariables(androidx.constraintlayout.core.state.State r9, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r10, androidx.constraintlayout.core.parser.CLObject r11) throws androidx.constraintlayout.core.parser.CLParsingException {
            java.util.ArrayList r0 = r11.names()
            if (r0 != 0) goto L8
            goto Lc6
        L8:
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc6
            java.lang.Object r1 = r0.next()
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            androidx.constraintlayout.core.parser.CLElement r1 = r11.get(r3)
            boolean r2 = r1 instanceof androidx.constraintlayout.core.parser.CLNumber
            if (r2 == 0) goto L29
            int r1 = r1.getInt()
            r10.put(r3, r1)
            goto Lc
        L29:
            boolean r2 = r1 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r2 == 0) goto Lc
            androidx.constraintlayout.core.parser.CLObject r1 = (androidx.constraintlayout.core.parser.CLObject) r1
            java.lang.String r2 = "from"
            boolean r4 = r1.has(r2)
            if (r4 == 0) goto L66
            java.lang.String r4 = "to"
            boolean r5 = r1.has(r4)
            if (r5 == 0) goto L66
            androidx.constraintlayout.core.parser.CLElement r2 = r1.get(r2)
            float r2 = r10.get(r2)
            androidx.constraintlayout.core.parser.CLElement r4 = r1.get(r4)
            float r5 = r10.get(r4)
            java.lang.String r4 = "prefix"
            java.lang.String r7 = r1.getStringOrNull(r4)
            java.lang.String r4 = "postfix"
            java.lang.String r8 = r1.getStringOrNull(r4)
            r6 = 1065353216(0x3f800000, float:1.0)
            r4 = r2
            r2 = r10
            r2.put(r3, r4, r5, r6, r7, r8)
            goto Lc
        L66:
            boolean r4 = r1.has(r2)
            if (r4 == 0) goto L89
            java.lang.String r4 = "step"
            boolean r5 = r1.has(r4)
            if (r5 == 0) goto L89
            androidx.constraintlayout.core.parser.CLElement r2 = r1.get(r2)
            float r2 = r10.get(r2)
            androidx.constraintlayout.core.parser.CLElement r1 = r1.get(r4)
            float r1 = r10.get(r1)
            r10.put(r3, r2, r1)
            goto Lc
        L89:
            java.lang.String r2 = "ids"
            boolean r4 = r1.has(r2)
            if (r4 == 0) goto Lb0
            androidx.constraintlayout.core.parser.CLArray r1 = r1.getArray(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4 = 0
        L9b:
            int r5 = r1.size()
            if (r4 >= r5) goto Lab
            java.lang.String r5 = r1.getString(r4)
            r2.add(r5)
            int r4 = r4 + 1
            goto L9b
        Lab:
            r10.put(r3, r2)
            goto Lc
        Lb0:
            java.lang.String r2 = "tag"
            boolean r4 = r1.has(r2)
            if (r4 == 0) goto Lc
            java.lang.String r1 = r1.getString(r2)
            java.util.ArrayList r1 = r9.getIdsForTag(r1)
            r10.put(r3, r1)
            goto Lc
        Lc6:
            return
    }

    public static void parseWidget(androidx.constraintlayout.core.state.State r2, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r3, androidx.constraintlayout.core.state.ConstraintReference r4, androidx.constraintlayout.core.parser.CLObject r5) throws androidx.constraintlayout.core.parser.CLParsingException {
            androidx.constraintlayout.core.state.Dimension r0 = r4.getWidth()
            if (r0 != 0) goto Ld
            androidx.constraintlayout.core.state.Dimension r0 = androidx.constraintlayout.core.state.Dimension.createWrap()
            r4.setWidth(r0)
        Ld:
            androidx.constraintlayout.core.state.Dimension r0 = r4.getHeight()
            if (r0 != 0) goto L1a
            androidx.constraintlayout.core.state.Dimension r0 = androidx.constraintlayout.core.state.Dimension.createWrap()
            r4.setHeight(r0)
        L1a:
            java.util.ArrayList r0 = r5.names()
            if (r0 != 0) goto L21
            goto L35
        L21:
            java.util.Iterator r0 = r0.iterator()
        L25:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            applyAttribute(r2, r3, r4, r5, r1)
            goto L25
        L35:
            return
    }

    public static void parseWidget(androidx.constraintlayout.core.state.State r0, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r1, java.lang.String r2, androidx.constraintlayout.core.parser.CLObject r3) throws androidx.constraintlayout.core.parser.CLParsingException {
            androidx.constraintlayout.core.state.ConstraintReference r2 = r0.constraints(r2)
            parseWidget(r0, r1, r2, r3)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static void populateState(@androidx.annotation.NonNull androidx.constraintlayout.core.parser.CLObject r9, @androidx.annotation.NonNull androidx.constraintlayout.core.state.State r10, @androidx.annotation.NonNull androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r11) throws androidx.constraintlayout.core.parser.CLParsingException {
            r0 = 2
            r1 = -1
            r2 = 1
            r3 = 0
            java.util.ArrayList r4 = r9.names()
            if (r4 != 0) goto Lc
            goto L130
        Lc:
            java.util.Iterator r4 = r4.iterator()
        L10:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L130
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            androidx.constraintlayout.core.parser.CLElement r6 = r9.get(r5)
            r5.getClass()
            int r7 = r5.hashCode()
            switch(r7) {
                case -1824489883: goto L42;
                case 1875016085: goto L37;
                case 1921490263: goto L2c;
                default: goto L2a;
            }
        L2a:
            r7 = r1
            goto L4c
        L2c:
            java.lang.String r7 = "Variables"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L35
            goto L2a
        L35:
            r7 = r0
            goto L4c
        L37:
            java.lang.String r7 = "Generate"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L40
            goto L2a
        L40:
            r7 = r2
            goto L4c
        L42:
            java.lang.String r7 = "Helpers"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L4b
            goto L2a
        L4b:
            r7 = r3
        L4c:
            switch(r7) {
                case 0: goto L125;
                case 1: goto L11a;
                case 2: goto L10f;
                default: goto L4f;
            }
        L4f:
            boolean r7 = r6 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r7 == 0) goto L102
            androidx.constraintlayout.core.parser.CLObject r6 = (androidx.constraintlayout.core.parser.CLObject) r6
            java.lang.String r7 = lookForType(r6)
            if (r7 == 0) goto Lfd
            int r8 = r7.hashCode()
            switch(r8) {
                case -1785507558: goto Lcf;
                case -1354837162: goto Lc4;
                case -1252464839: goto Lb9;
                case -851656725: goto Lad;
                case -333143113: goto La2;
                case 113114: goto L96;
                case 3181382: goto L8b;
                case 98238902: goto L80;
                case 111168196: goto L72;
                case 965681512: goto L65;
                default: goto L62;
            }
        L62:
            r8 = r1
            goto Lda
        L65:
            java.lang.String r8 = "hGuideline"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L6e
            goto L62
        L6e:
            r8 = 9
            goto Lda
        L72:
            java.lang.String r8 = "vFlow"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L7c
            goto L62
        L7c:
            r8 = 8
            goto Lda
        L80:
            java.lang.String r8 = "hFlow"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L89
            goto L62
        L89:
            r8 = 7
            goto Lda
        L8b:
            java.lang.String r8 = "grid"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L94
            goto L62
        L94:
            r8 = 6
            goto Lda
        L96:
            java.lang.String r8 = "row"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto La0
            goto L62
        La0:
            r8 = 5
            goto Lda
        La2:
            java.lang.String r8 = "barrier"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto Lab
            goto L62
        Lab:
            r8 = 4
            goto Lda
        Lad:
            java.lang.String r8 = "vChain"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto Lb7
            goto L62
        Lb7:
            r8 = 3
            goto Lda
        Lb9:
            java.lang.String r8 = "hChain"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto Lc2
            goto L62
        Lc2:
            r8 = r0
            goto Lda
        Lc4:
            java.lang.String r8 = "column"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto Lcd
            goto L62
        Lcd:
            r8 = r2
            goto Lda
        Lcf:
            java.lang.String r8 = "vGuideline"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto Ld9
            goto L62
        Ld9:
            r8 = r3
        Lda:
            switch(r8) {
                case 0: goto Lf8;
                case 1: goto Lf3;
                case 2: goto Lee;
                case 3: goto Lee;
                case 4: goto Le9;
                case 5: goto Lf3;
                case 6: goto Lf3;
                case 7: goto Le4;
                case 8: goto Le4;
                case 9: goto Ldf;
                default: goto Ldd;
            }
        Ldd:
            goto L10
        Ldf:
            parseGuidelineParams(r3, r10, r5, r6)
            goto L10
        Le4:
            parseFlowType(r7, r10, r5, r11, r6)
            goto L10
        Le9:
            parseBarrier(r10, r5, r6)
            goto L10
        Lee:
            parseChainType(r7, r10, r5, r11, r6)
            goto L10
        Lf3:
            parseGridType(r7, r10, r5, r11, r6)
            goto L10
        Lf8:
            parseGuidelineParams(r2, r10, r5, r6)
            goto L10
        Lfd:
            parseWidget(r10, r11, r5, r6)
            goto L10
        L102:
            boolean r7 = r6 instanceof androidx.constraintlayout.core.parser.CLNumber
            if (r7 == 0) goto L10
            int r6 = r6.getInt()
            r11.put(r5, r6)
            goto L10
        L10f:
            boolean r5 = r6 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r5 == 0) goto L10
            androidx.constraintlayout.core.parser.CLObject r6 = (androidx.constraintlayout.core.parser.CLObject) r6
            parseVariables(r10, r11, r6)
            goto L10
        L11a:
            boolean r5 = r6 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r5 == 0) goto L10
            androidx.constraintlayout.core.parser.CLObject r6 = (androidx.constraintlayout.core.parser.CLObject) r6
            parseGenerate(r10, r11, r6)
            goto L10
        L125:
            boolean r5 = r6 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r5 == 0) goto L10
            androidx.constraintlayout.core.parser.CLArray r6 = (androidx.constraintlayout.core.parser.CLArray) r6
            parseHelpers(r10, r11, r6)
            goto L10
        L130:
            return
    }

    private static float toPix(androidx.constraintlayout.core.state.State r0, float r1) {
            androidx.constraintlayout.core.state.CorePixelDp r0 = r0.getDpToPixel()
            float r0 = r0.toPixels(r1)
            return r0
    }
}
