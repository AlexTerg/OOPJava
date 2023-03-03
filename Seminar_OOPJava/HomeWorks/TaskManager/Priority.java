package HomeWorks.TaskManager;

enum Priority {
    LOW("Низкий"),
    MIDDLE("Средний"),
    HIGHT("Высокий");

    String translate;

    Priority(String translate) {
        this.translate = translate;
    }

    String getTranslate() {
        return this.translate;
    }
}


