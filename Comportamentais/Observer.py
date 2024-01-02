from abc import ABC, abstractmethod

class Observer(ABC):
    @abstractmethod
    def update(self, data):
        pass

class ConcreteObserverA(Observer):
    def update(self, data):
        return f"ConcreteObserverA received update with data: {data}"

class ConcreteObserverB(Observer):
    def update(self, data):
        return f"ConcreteObserverB received update with data: {data}"

class Subject:
    def __init__(self):
        self._observers = []

    def add_observer(self, observer):
        self._observers.append(observer)

    def remove_observer(self, observer):
        self._observers.remove(observer)

    def notify_observers(self, data):
        return [observer.update(data) for observer in self._observers]

# Uso
subject = Subject()
observer_a = ConcreteObserverA()
observer_b = ConcreteObserverB()
subject.add_observer(observer_a)
subject.add_observer(observer_b)
print(subject.notify_observers("New data"))  # ["ConcreteObserverA received update with data: New data", "ConcreteObserverB received update with data: New data"]
