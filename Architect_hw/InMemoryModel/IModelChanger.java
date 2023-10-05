package Architect_hw.InMemoryModel;

// Интерфейс для объекта, который может менять модель
interface IModelChanger {
    void notifyChange(IModelChanger sender);
}