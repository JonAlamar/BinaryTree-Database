public class BinaryTreeDatabase {

    Node xyz;
    Node current;

    public BinaryTreeDatabase() {
        xyz = new Node("XYZ Air");
    }

    public void addFlight(String flight) {
        current = xyz;
        Node newNode = new Node(flight);

        if (current.leftChild == null) {
            current.leftChild = newNode;
            System.out.println(flight + " has been added!");
        } else {
            current = current.leftChild;
            while (current.rightChild != null) {
                current = current.rightChild;
            }
            current.rightChild = newNode;
            System.out.println(flight + " has been added!");
        }
    }

    public void deleteFlight(String flight) {
        current = xyz;

        if (current.leftChild.name == flight) {
            current.leftChild = current.leftChild.rightChild;
            System.out.println(flight + " has been deleted!");
        } else {
            current = current.leftChild;
            while (current.rightChild.name != flight) {
                current = current.rightChild;
            }
            current.rightChild = current.rightChild.rightChild;
            System.out.println(flight + " has been deleted!");
        }
    }

    public void searchFlight(String flight) {
        current = xyz.leftChild;

        if (current == null) {
            System.out.println("There are no flights to search for!");
        } else {
            while (current != null) {
                if (current.name == flight) {
                    System.out.println(flight + " has been found!");
                    return;
                }
                current = current.rightChild;
            }
            System.out.println(flight + " does not exist!");
        }
    }

    public void listFlights() {
        current = xyz;

        System.out.println("\n****** List of current flights: ******");
        if (current.leftChild == null) {
            System.out.println("There are no flights to list!\n");
        } else {
            current = current.leftChild;
            while (current != null) {
                System.out.println(current.name);
                current = current.rightChild;
            }
            System.out.println("");
        }
    }

    public void addDate(String flight, String date) {
        current = xyz.leftChild;
        Node newNode = new Node(date);

        while (current != null) {
            if (current.name == flight) {
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    System.out.println("Date " + date + " has been added to " + flight);
                    return;
                } else {
                    current = current.leftChild;
                    while (current.rightChild != null) {
                        current = current.rightChild;
                    }
                    current.rightChild = newNode;
                    System.out.println("Date " + date + " has been added to " + flight);
                    return;
                }
            }
            current = current.rightChild;
        }
        System.out.println(flight + " does not exist to add date " + date + "!");
    }

    public void deleteDate(String flight, String date) {
        current = xyz.leftChild;

        while (current != null) {
            if (current.name == flight) {
                if (current.leftChild.name == date) {
                    if (current.leftChild.rightChild == null) {
                        current.leftChild = null;
                        System.out.println("Date " + date + " from " + flight + " has been deleted");
                        return;
                    } else {
                        current.leftChild = current.leftChild.rightChild;
                        System.out.println("Date " + date + " from " + flight + " has been deleted");
                        return;
                    }
                } else {
                    current = current.leftChild;
                    while (current.rightChild != null) {
                        if (current.rightChild.name == date) {
                            if (current.rightChild.rightChild == null) {
                                current.rightChild = null;
                                System.out.println("Date " + date + " from " + flight + " has been deleted");
                                return;
                            } else {
                                current.rightChild = current.rightChild.rightChild;
                                System.out.println("Date " + date + " from " + flight + " has been deleted");
                                return;
                            }
                        }
                        current = current.rightChild;
                    }
                }
            }
            current = current.rightChild;
        }
        System.out.println(date + " does not exist for " + flight + "!");
    }

    public void listDates(String flight) {
        current = xyz.leftChild;

        while (current != null) {
            if (current.name == flight) {
                if (current.leftChild == null) {
                    System.out.println("No dates for " + flight + " exist!");
                    return;
                } else {
                    current = current.leftChild;
                    System.out.println("\n****** List of dates for " + flight);
                    while (current != null) {
                        System.out.println(current.name);
                        current = current.rightChild;
                    }
                    return;
                }
            }
            current = current.rightChild;
        }
    }

    public void addPassenger(String flight, String date, String passenger) {
        current = xyz.leftChild;
        Node newNode = new Node(passenger);

        while (current != null) {
            while (current.name == flight) {
                current = current.leftChild;
                if (current.name == date) {
                    if (current.leftChild == null) {
                        current.leftChild = newNode;
                        System.out.println(passenger + " has been added to " + flight + " on " + date);
                        return;
                    } else {
                        current = current.leftChild;
                        while (current.rightChild != null) {
                            current = current.rightChild;
                        }
                        current.rightChild = newNode;
                        System.out.println(passenger + " has been added to " + flight + " on " + date);
                        return;
                    }
                } else {
                    while (current.rightChild != null) {
                        if (current.rightChild.name == date) {
                            current = current.rightChild;
                            if (current.leftChild == null) {
                                current.leftChild = newNode;
                                System.out.println(passenger + " has been added to " + flight + " on " + date);
                                return;
                            } else {
                                current = current.leftChild;
                                while (current.rightChild != null) {
                                    current = current.rightChild;
                                }
                                current.rightChild = newNode;
                                System.out.println(passenger + " has been added to " + flight + " on " + date);
                                return;
                            }
                        }
                        current = current.rightChild;
                    }
                }
            }
            current = current.rightChild;
        }
        current = current.rightChild;
    }

    public void deletePassenger(String flight, String date, String passenger) {
        current = xyz.leftChild;

        while (current != null) {
            while (current.name == flight) {
                current = current.leftChild;
                while (current != null) {
                    while (current.name == date) {
                        if (current.leftChild.name == passenger) {
                            if (current.leftChild.rightChild == null) {
                                current.leftChild = null;
                                System.out.println(passenger + " has been deleted from " + flight + " on " + date);
                                return;
                            } else {
                                current.leftChild = current.leftChild.rightChild;
                                System.out.println(passenger + " has been deleted from " + flight + " on " + date);
                                return;
                            }
                        } else {
                            current = current.leftChild;
                            while (current.rightChild.name != passenger) {
                                current = current.rightChild;
                            }
                            if (current.rightChild.rightChild == null) {
                                current.rightChild = null;
                                System.out.println(passenger + " has been deleted from " + flight + " on " + date);
                                return;
                            } else {
                                current.rightChild = current.rightChild.rightChild;
                                System.out.println(passenger + " has been deleted from " + flight + " on " + date);
                                return;
                            }
                        }
                    }
                    current = current.rightChild;
                }
            }
            current = current.rightChild;
        }
    }

    public void listPassengers(String flight, String date) {
        current = xyz.leftChild;

        while (current != null) {
            while (current.name == flight) {
                current = current.leftChild;
                while (current != null) {
                    while (current.name == date) {
                        if (current.leftChild == null) {
                            System.out.println("There are no passengers on " + flight + "!");
                        } else {
                            current = current.leftChild;
                            System.out.println("\n****** Passengers on " + flight + " on " + date + " ******");
                            while (current != null) {
                                System.out.println(current.name);
                                current = current.rightChild;
                            }
                            return;
                        }
                    }
                    current = current.rightChild;
                }
            }
            current = current.rightChild;
        }
    }
}