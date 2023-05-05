package com.kodilla.good.patterns.srp;

import java.time.LocalDateTime;

public class RentalProcessor {

    private InformationService informationService;
    private RentalService rentalService;
    private RentalRepository rentalRepository;


    public RentalProcessort(final InformationService informationService,
                            final RentalService rentalService,
                            final RentalRepository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }

    public RentalDto process(final User user, final LocalDateTime from, final LocalDateTime to) {
        boolean isRented = rentalService.rent(user, from, to);
        if (isRented) {
            informationService.inform(user);
            rentalRepository.createRental(user, from, to);
            return new RentalDto(user, true);
        } else {
            return new RentalDto(user, false);
        }
    }

}
