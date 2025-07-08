public class enums {

        public enum taxes{
            TAXES(23),
            GST(12);

            private final int rate;
            taxes(int rate){
                this.rate = rate;
            }

            public int getRate(){
                return rate;
            };
        }
}

