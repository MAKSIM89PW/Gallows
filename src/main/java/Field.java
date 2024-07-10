public enum Field {
        ZERO {
            @Override
            public String toString() {
                return "     _____\n" +
                        "     |    \n" +
                        "     |    \n" +
                        "     |    \n" +
                        "     |    \n" +
                        "     |_____\n";
            }
        },
        ONE {
            @Override
            public String toString() {
                return "     _____\n" +
                        "     |    O\n" +
                        "     |    \n" +
                        "     |    \n" +
                        "     |    \n" +
                        "     |_____\n";
            }
        },
        TWO {
            @Override
            public String toString() {
                return "     _____\n" +
                        "     |    O\n" +
                        "     |    |\n" +
                        "     |    |\n" +
                        "     |    \n" +
                        "     |_____\n";
            }
        },
        THREE {
            @Override
            public String toString() {
                return "     _____\n" +
                        "     |    O\n" +
                        "     |    |--\n" +
                        "     |    |\n" +
                        "     |    \n" +
                        "     |_____\n";
            }
        },
        FOUR {
            @Override
            public String toString() {
                return "     _____\n" +
                        "     |    O\n" +
                        "     |  --|--\n" +
                        "     |    |\n" +
                        "     |    \n" +
                        "     |_____\n";
            }
        },
        FIVE {
            @Override
            public String toString() {
                return "     _____\n" +
                        "     |    O\n" +
                        "     |  --|--\n" +
                        "     |    |\n" +
                        "     |     \\\n" +
                        "     |_____\n";
            }
        },
        SIX {
            @Override
            public String toString() {
                return "     _____\n" +
                        "     |    O\n" +
                        "     |  --|--\n" +
                        "     |    |\n" +
                        "     |   / \\\n" +
                        "     |_____\n";
            }
        }
    }

}
