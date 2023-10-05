package Architect_hw.InMemoryModel;

// Интерфейс для слушателя изменений модели
interface IModelChangeObserver {
    void applyUpdateModel();
}